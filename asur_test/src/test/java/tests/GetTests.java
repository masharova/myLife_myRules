package tests;

import io.restassured.RestAssured;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class GetTests {

    @Test
    public void verifyThatUrlShouldReturnSuccessfulStatusCode() {
        given().header("content-type", "application/json")
                .param("status", "pending")
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=pending")
                .then().log().body();
        assertThat(RestAssured.given().response().statusCode(200));
    }
}
