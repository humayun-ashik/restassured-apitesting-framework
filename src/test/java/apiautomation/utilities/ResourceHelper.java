package apiautomation.utilities;

import apiautomation.BaseTest.BaseTest;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ResourceHelper extends BaseTest {

    public static Response get(String url) {
        return given().when().get(url);
    }

    public static Response create(String url, String json) {
        return given()
                .headers("Content-Type","application/json","Authorization", propertiesReader.getBearerToken())
                .body(json)
                .post(url);
    }

    public static Response createUnauthorized(String url, String json) {
        return given()
                .headers("Content-Type","application/json")
                .body(json)
                .post(url);
    }


}
