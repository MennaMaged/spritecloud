package apiTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import pageObjectModel.Pet;

public class PetTest {
private Pet pet;
    
    @Test(priority = 1)
    public void placeOrder() {
	String[] PhotoURLs = {"http://google.drive"};
	System.out.println("Add new pet to the store");
	Response response = pet.addNewPet("Cats","kitty",PhotoURLs,"testTagName","placed");
	System.out.println(response.asString());
	Assert.assertEquals(response.getStatusCode(),200);
    }
    
    @Test(priority = 2, dependsOnMethods = { "placeOrder" })
    public void placeOrderWithExistingPet() {
	String[] PhotoURLs = {"http://google.drive"};
	System.out.println("Add existing pet to the store");
	Response response = pet.addNewPet("Cats","kitty",PhotoURLs,"testTagName","placed");
	System.out.println(response.asString());
	Assert.assertEquals(response.getStatusCode(),405);
    }
    
    @BeforeClass
    public void beforeClass() {
	System.setProperty("baseURL","https://petstore.swagger.io/v2/");
	pet = new Pet(System.getProperty("baseURL"));
    }
}
