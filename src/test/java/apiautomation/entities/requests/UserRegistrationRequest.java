package apiautomation.entities.requests;

import apiautomation.utilities.RestUtils;
import org.json.simple.JSONObject;

public class UserRegistrationRequest {

    String userName= RestUtils.getName();
    String userGender=RestUtils.getGender();
    String userEmail=RestUtils.getEmail(RestUtils.getName());
    String userStatus=RestUtils.getStatus();

    public JSONObject getRequestParams() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", userName);
        requestParams.put("gender", userGender);
        requestParams.put("email", userEmail);
        requestParams.put("status", userStatus);

        return requestParams;
    }

    public JSONObject getRequestParams(String status) {
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", userName);
        requestParams.put("gender", userGender);
        requestParams.put("email", userEmail);
        requestParams.put("status", status);

        return requestParams;
    }
    public JSONObject getRequestParams(String userName, String duplicateEmail) {
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", userName);
        requestParams.put("gender", userGender);
        requestParams.put("email", duplicateEmail);
        requestParams.put("status", userStatus);

        return requestParams;
    }

}
