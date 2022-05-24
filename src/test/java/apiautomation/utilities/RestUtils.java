package apiautomation.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
    public static String getName() {
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("John"+generatedString);
    }

    public static String empSal() {
        String generatedString = RandomStringUtils.randomNumeric(5);
        return (generatedString);
    }

    public static String empAge() {
        String generatedString = RandomStringUtils.randomNumeric(2);
        return (generatedString);
    }

    public static String getGender() {
        String gender = "male";
        return gender;
    }

    public static String getEmail(String name) {
        return name+"@yopmail.com";
    }

    public static String getStatus() {
        return "active";
    }
}
