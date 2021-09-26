package pageObjectModel;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Store extends API{

    // service names
    private String placeOrderServiceName = "store/order";

    // variables
    RequestSpecification request = RestAssured.given();

    public Store(String URL) {
	super(URL);
    }

    public Response placeOrder(int quantity, String shipDate, String status, Boolean complete) {
	
	JSONObject requestParams = new JSONObject();
	
	requestParams.put("id", 0); 
	requestParams.put("petId", 0); 
	requestParams.put("quantity", 0);
	requestParams.put("shipDate", shipDate);
	requestParams.put("status", status);
	requestParams.put("complete", complete);

	
	request.header("Content-Type", "application/json");
	request.body(requestParams);
	
	System.out.println(super.baseURL + placeOrderServiceName);
	return request.post(super.baseURL + placeOrderServiceName);

    }

}
