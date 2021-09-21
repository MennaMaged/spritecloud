package apiTest;

import org.testng.annotations.Test;

import pageObjectModel.Login;

public class LoginTest {
    @Test
    public void validLogin() {
	System.out.println("test");
	Login login = new Login();
	login.performLogin("menna", "menna");
    }
}
