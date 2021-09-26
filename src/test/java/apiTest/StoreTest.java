package apiTest;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import pageObjectModel.Store;

public class StoreTest {
    
private Store store;
    
    @Test(priority = 1)
    public void placeOrder() {
	System.out.println("Place an order for a pet");
	Response response = store.placeOrder(1,"2021-09-26T22:23:30.696Z","placed",true);
	System.out.println(response.asString());
	Assert.assertEquals(response.getStatusCode(),200);
    }
    
    @BeforeClass
    public void beforeClass() {
	System.setProperty("baseURL","https://petstore.swagger.io/v2/");
	store = new Store(System.getProperty("baseURL"));
    }
}
