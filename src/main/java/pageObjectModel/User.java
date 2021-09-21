package pageObjectModel;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class User {
	
	private String getLoginServiceName = "v2/user/login";


	public void performLogin(String username, String password) {
		
		RestAssured.baseURI ="https://petstore.swagger.io/";
		RequestSpecification request = RestAssured.given();

//		JSONObject requestParams = new JSONObject();
//		requestParams.put("FirstName", "Virender"); // Cast
//		requestParams.put("LastName", "Singh");
//		requestParams.put("UserName", "sdimpleuser2dd2011");
//		requestParams.put("Password", "password1");	
//		requestParams.put("Email",  "sample2ee26d9@gmail.com");
//
//		request.body(requestParams.toString());
		Response response = request.get(RestAssured.baseURI+getLoginServiceName+"?username=menna&password=menna");

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);

		System.out.println("Response body: " + response.body().asString());
		
		
	}

}
