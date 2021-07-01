package tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class BodyTest extends BaseClass {

    @Test
    public void checkResponseByPetId() {
        RestAssured.baseURI = URL_FOR_CHECK_BODY_BY_PET_ID;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get().
                then().contentType(ContentType.JSON).
                extract().response();
        String body = response.getBody().prettyPrint();
        io.restassured.path.json.JsonPath jsonPathEvaluator = response.jsonPath();
        String name = jsonPathEvaluator.get("name");
        assertThat(name.equals("doggie"));

    }

    @Test
    public void checkResponseByPetStatus() {
        RestAssured.baseURI = URL_FOR_CHECK_BODY_BY_PET_STATUS;
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get().
                then().contentType(ContentType.JSON).
                extract().response();
        String body = response.getBody().prettyPrint();
        io.restassured.path.json.JsonPath jsonPathEvaluator = response.jsonPath();
        String name = jsonPathEvaluator.get("status");
        assertThat(name.equals("available"));

    }
}
