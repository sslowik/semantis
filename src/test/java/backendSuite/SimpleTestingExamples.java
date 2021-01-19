package backendSuite;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.minidev.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTestingExamples {

    JSONObject requestParams = new JSONObject();

    @BeforeClass
    void prepareRequestParams() {
        requestParams.put("FirstName", "Virender");
        requestParams.put("LastName", "Singh");

        requestParams.put("UserName", "simpleuser001");
        requestParams.put("Password", "password1");
        requestParams.put("Email", "someuser@gmail.com");
    }

    @BeforeTest
    void setupRestAssured() {
        RestAssured.baseURI ="https://restapi.demoqa.com/customer";
    }

    @Test
    void simplePostTest() {
        RequestSpecification request = RestAssured.given();
        //set request header as JSON
        request.header("Content-Type", "application/json");
        request.body(requestParams.toJSONString());
        Response response = request.post("/register");

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, "201");
        String successCode = response.jsonPath().get("SuccessCode");
        System.out.println("successCode = " + successCode);
        Assert.assertEquals( "Correct Success code was returned", successCode, "OPERATION_SUCCESS");
    }
}
