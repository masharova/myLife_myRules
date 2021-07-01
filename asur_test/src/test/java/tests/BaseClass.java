package tests;

import com.dto.Category;
import com.dto.PetDto;
import com.dto.Tags;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.Matchers;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public abstract class BaseClass {

    public static RequestSpecification spec;
    public static ResponseSpecification respec;
    public static Long MAX_TIMEOUT = 60000l;
    public static String URL = "https://petstore.swagger.io/v2/pet/";
    public static String URL_FOR_CHECK_BODY_BY_PET_ID = "https://petstore.swagger.io/v2/pet/9223127596080583077";
    public static String URL_FOR_CHECK_BODY_BY_PET_STATUS = "https://petstore.swagger.io/v2/pet/findByStatus?status=pending";

    @BeforeClass
    public static void initializationSpecification() {
        spec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .setBaseUri(URL)
                .addFilter(new ResponseLoggingFilter())
                .addFilter(new RequestLoggingFilter())
                .build();
        respec = new ResponseSpecBuilder().expectResponseTime(Matchers.lessThan(MAX_TIMEOUT)).build();


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

    public PetDto createDummyPet() {
        String[] photoUrl = new String[]{"string"};
        Tags tag = new Tags();

        tag.setId(6);
        tag.setName("doggy");
        Tags[] tags = new Tags[]{tag};
        Category category = new Category();
        category.setId(9);
        category.setName("dog");
        return new PetDto()
                .setName("miki")
                .setId(898)
                .setPhotoUrls(photoUrl)
                .setCategory(category)
                .setStatus("available")
                .setTags(tags);
    }

    public Response deleteRequest(int idPet) {
        return given()
                .spec(spec)
                .header("Content-type", "application/json")
                .when()
                .delete(String.valueOf(idPet))
                .then()
                .spec(respec)
                .extract().response();

    }

    public Response getPet(RequestSpecification spec, int idPet) {

        return given()
                .spec(spec)
                .header("Content-type", "application/json")
                .when()
                .get(String.valueOf(idPet))
                .then()
                .spec(respec)
                .extract().response();

    }

    public String createResource(String path, Object bodyPayload) {

        return given()
                .spec(spec)
                .body(bodyPayload)
                .when()
                .post(path)
                .then()
                .spec(respec)
                .statusCode(200)
                .extract().header("location");

    }

    public <T> T getResource(String locationHeader, Class<T> responseClass) {
        return given()
                .spec(spec)
                .when()
                .get(locationHeader)
                .then()
                .spec(respec)
                .statusCode(200)
                .extract().as(responseClass);

    }

    public void assertEqualPet(PetDto newPet, PetDto retrievedPet) {
        assertThat(retrievedPet.getId()).isEqualTo(newPet.getId());
        assertThat(retrievedPet.getName()).isEqualTo(newPet.getName());
        assertThat(retrievedPet.getStatus()).isEqualTo(newPet.getStatus());

    }
}
