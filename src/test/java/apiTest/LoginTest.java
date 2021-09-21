package apiTest;

import org.testng.annotations.Test;

import pageObjectModel.login;

public class LoginTest {
	@Test
	public void validLogin() {
		System.out.println("test");

		login login = new login();
		login.performLogin("menna", "menna");

	}
}
