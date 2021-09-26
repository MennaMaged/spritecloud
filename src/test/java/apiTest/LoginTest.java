package apiTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import pageObjectModel.API;

public class LoginTest {
    
    private API api;
    
    @Test(priority = 1)
    public void validLogin() {
	System.out.println("First TC - login with valid username and password");
	Response response = api.login("menna", "menna");
	Assert.assertEquals(response.getStatusCode(),200);
    }
    
    @Test(priority = 2)
    public void loginWithEmptyUsernameAndPassword() {
	System.out.println("Second TC - login with empty username and password");
	Response response = api.login("","");
	Assert.assertEquals(response.getStatusCode(),400);
    }
    
    @Test(priority = 3)
    public void loginWithDeletedUser() {
	System.out.println("Third TC - login with deleted user");
	// deletedUser is created and deleted with delete user endpoint
	Response response = api.login("deletedUser","deletedUser");
	Assert.assertEquals(response.getStatusCode(),400);
    }
    
    @BeforeClass
    public void beforeClass() {
	System.setProperty("baseURL","https://petstore.swagger.io/v2/");
	api = new API(System.getProperty("baseURL"));
    }

}