package pageObjectModel;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API {

    // service names
    private String getLoginServiceName = "user/login";
    
    // variables
    protected String baseURL;
    RequestSpecification request = RestAssured.given();

    //constructor
    public API(String URL) {
	this.baseURL = URL;
    }

    public Response login(String username, String password) {
	System.out.println(this.baseURL + getLoginServiceName + "?username="+username+"&password="+password);
	return request.get(this.baseURL + getLoginServiceName + "?username="+username+"&password="+password); 
    }

}
