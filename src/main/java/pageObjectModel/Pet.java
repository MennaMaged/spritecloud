package pageObjectModel;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Pet extends API{

    // service names
    private String addNewPetServiceName = "pet";

    // variables
    RequestSpecification request = RestAssured.given();

    public Pet(String URL) {
	super(URL);
    }

    public Response addNewPet(String category, String name, String [] photoUrls, final String tagName, String status) {
	Map<String, Object> map = new LinkedHashMap<String, Object>();
	map.put("tags", Arrays.asList(new LinkedHashMap<String, Object>() {
	    {
	        put("id",0);
	        put("name",tagName);
	    }
	}));
	
	JSONObject requestParams = new JSONObject();
	
	requestParams.put("id", 0); 
	requestParams.put("category", category); 
	requestParams.put("name", name);
	requestParams.put("photoUrls", photoUrls);
	requestParams.put("tags", map);
	requestParams.put("status", status);
	
	request.header("Content-Type", "application/json");
	request.body(requestParams);
	
	System.out.println(super.baseURL + addNewPetServiceName);
	return request.post(super.baseURL + addNewPetServiceName);

    }

}
