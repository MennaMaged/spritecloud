package pageObjectModel;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API {

    // request types
    protected static final String requestTypeGet = "GET";
    protected static final String requestTypePut = "PUT";
    protected static final String requestTypePost = "POST";
    protected static final String requestTypePatch = "PATCH";
    protected static final String requestTypeDelete = "DELETE";
    // status codes    
//    protected final static String successStatusCode = "200";
//    protected final static String failStatusCode = "500";
//    protected final static String DeleteSuccessStatuesCode = "204";
//    protected final static String unauthorizedCode = "401";
//    protected final static String badStatusCode = "400";
//    protected final static String conflictCode = "409";
//    protected final static String forbiddenStatusCode = "403";
//    protected final static String BadGateway = "502";
//    protected final static String ServiceUnavailable = "503";
//    protected final static String UnprocessableStatusCode = "422";
//    protected final static String NotFoundStatusCode = "404";
    
    // service names
    private String getLoginServiceName = "user/login";
    
    // variables
    private String baseURL;
    RequestSpecification request = RestAssured.given();

    public enum StatusCode {

	successStatusCode("200"), BFF_successStatusCode("201"), forbiddenStatusCode("403"),
	unauthorizedStatusCode("401"), internalServerErrorStatusCode("500"), badGatewayStatusCode("502"),
	serviceUnavailableStatusCode("503"), badRequestStatusCode("400"), conflictStatusCode("409"),
	deleteSuccessStatuesCode("204"), unprocessableStatusCode("422"), NotFoundStatusCode("404"),
	PreConditionFailed("412");

	// constructor
	private StatusCode(final String statusCode) {
	    this.statusCode = statusCode;
	}

	// internal state
	private String statusCode;

	public String getStatusCode() {
	    return statusCode;
	}
    }

    public API() {
	baseURL=RestAssured.baseURI = System.getProperty("baseURL");
	
    }

    public Response login(String username, String password) {
	return request.get(baseURL + getLoginServiceName + "?username="+username+"&password="+password); 
    }

}
