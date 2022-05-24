package apiautomation.entities.response;

import apiautomation.TestCases.UserRegistrationTest;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.concurrent.TimeUnit;

public class UserRegResponse extends UserRegistrationTest {
    public int getResponseStatusCode(Response response){
        return response.getStatusCode();

    }

    public String getResponseBody(Response response){
        return response.getBody().asString();

    }

    public String getContentType(Response response){
        return response.header("Content-Type");

    }
    public String getAnyResponseParam(Response response, String key){
        JsonPath jsonpath = response.jsonPath();
        String value = jsonpath.get(key);
        return value;

    }

    public long getResponseTime(Response response){
        return response.getTimeIn(TimeUnit.MILLISECONDS);
    }







}
