package apiTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import pageObjectModel.User;

public class UserTest {
private User user;
    
    @Test(priority = 1)
    public void createUser() {
	System.out.println("create new user");
	Response response = user.createUser("newUser","newUser","newUser","newUser","newUser","123");
	System.out.println(response.asString());
	Assert.assertEquals(response.getStatusCode(),200);
    }
    
    @BeforeClass
    public void beforeClass() {
	System.setProperty("baseURL","https://petstore.swagger.io/v2/");
	user = new User(System.getProperty("baseURL"));
    }
}
