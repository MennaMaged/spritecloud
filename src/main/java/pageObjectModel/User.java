package pageObjectModel;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class User extends API {

    // service names
    private String createUserServiceName = "user";

    // variables
    RequestSpecification request = RestAssured.given();

    public User(String URL) {
	super(URL);
    }

    public Response createUser(String username, String firstname, String lastName, String email, String password,
	    String phone) {
	
	JSONObject requestParams = new JSONObject();
	
	requestParams.put("id", 0); 
	requestParams.put("username", username); 
	requestParams.put("firstname", firstname);
	requestParams.put("lastName", lastName);
	requestParams.put("email", email);
	requestParams.put("password", password);
	requestParams.put("phone", phone);
	requestParams.put("userStatus", 0);
	
	request.header("Content-Type", "application/json");
	request.body(requestParams);
	
	System.out.println(super.baseURL + createUserServiceName);
	return request.post(super.baseURL + createUserServiceName);

    }

}