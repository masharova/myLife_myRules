package tests;

import com.dto.ApiResponseDto;
import com.dto.UserDto;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class UserAPITests {
    private static RequestSpecification spec;
    public static ResponseSpecification respec;
    private PostTests post = new PostTests();


    @BeforeClass
    public static void initSpec() {
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri("https://petstore.swagger.io/v2/user/")
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();
    }

    private UserDto createDummyUser() {
        return new UserDto()
                .setLastname("Masharova")
                .setId(1140)
                .setPassword("password")
                .setUserName("hkbbkjb")
                .setEmail("ann@epam.com")
                .setPhone("0987896756")
                .setUserStatus(1)
                .setFirstName("Ann");
    }

    private ApiResponseDto login(String locationHeader, String username, String password) {
        return given()
                .spec(spec)
                .queryParam("username", username)
                .queryParam("password", password)
                .when()
                .get(locationHeader)
                .then()
                .statusCode(200)
                .extract().as(ApiResponseDto.class);
    }

    private UserDto getUserByUserName(String username) {
        return given()
                .spec(spec)
                .pathParam("username", username)
                .when()
                .get("{username}")
                .then()
                .statusCode(200)
                .extract().as(UserDto.class);
    }

    public Response putResource(Object bodyPayload, RequestSpecification spec) {
        return given()
                .spec(spec)
                .body(bodyPayload)
                .when()
                .put("")
                .then()
                .spec(respec)
                .extract().response();

    }

    @Test
    public void checkUserApiResponse() {
        UserDto newUser = createDummyUser();
        ApiResponseDto apiResponseDto = login("login", newUser.getUserName(), newUser.getPassword());
        String text = post.createResource("", newUser);
        UserDto retrievedUser = getUserByUserName(newUser.getUserName());
        assertEquals(putResource(newUser, spec).getStatusCode(), 200);

    }
}
