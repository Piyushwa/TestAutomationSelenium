package packaget1;

import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredClass {
	
	@Test
	public static void gettempcity(){
		
	
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		
		
		RequestSpecification httpRequest =RestAssured.given();
		
		 Response response = httpRequest.request(Method.GET, "/Hyderabad");
		 
		 String Respsonsebody = response.getBody().asString();
		 
		 System.out.println(Respsonsebody);
		 
		 int Statuscode = response.getStatusCode();
		 
		 System.out.println(Statuscode);
		 
		 System.out.println(response.getHeader("Content-Type"));
		
	}

	public static void main(String[] args) {
gettempcity();
			}

}
