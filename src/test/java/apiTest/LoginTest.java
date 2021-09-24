package apiTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import pageObjectModel.User;

public class LoginTest {
    
    User user = new User();
    
    @Test
    public void validLogin() {
	System.out.println("First TC - login with valid username and password");
	Response response = user.login("menna", "menna");
	Assert.assertEquals(response.getStatusCode(),200);
    }
    
    @Test
    public void invalidLogin() {
	System.out.println("Second TC - login with invalid username and password");
	Response response = user.login("", "");
	Assert.assertEquals(response.getStatusCode(),403);
    }

}