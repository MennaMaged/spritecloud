package apiTest;

import org.testng.annotations.Test;

import pageObjectModel.User;

public class LoginTest {
    @Test
    public void validLogin() {
	System.out.println("test");
	User login = new User();
	login.performLogin("menna", "menna");
    }
}
