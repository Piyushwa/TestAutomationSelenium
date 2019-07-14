package packaget1;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPost {
	
	@Test
	public static void Postmethod(){
		
	RestAssured.baseURI = "http://restapi.demoqa.com/customer";
	
	RequestSpecification request = RestAssured.given();
	
	JSONObject requestParams  = new JSONObject();
	
	requestParams.put("FirstName", "Piyush"); 
	requestParams.put("LastName", "Wadhwa");
	 
	requestParams.put("UserName", "Piyush23");
	requestParams.put("Password", "352346346");
	requestParams.put("Email",  "s3r35r@gmail.com");
	
	
	request.header("Content-Type", "application/json");
	

	// Add the Json to the body of the request
	request.body(requestParams.toJSONString());
	 
	// Post the request and check the response
	Response response = request.post("/register");
	
	System.out.println(response.body().asString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Postmethod();
	}

}
