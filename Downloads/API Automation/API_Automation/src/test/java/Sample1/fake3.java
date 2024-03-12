package Sample1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class fake3 {

	public static void main(String[] args) {


		RestAssured.baseURI="https://freetestapi.com/api/v1/politicians?limit=5";
		
		RequestSpecification http=RestAssured.given();
		
		http.header("Content-Type","application/json");
		
		Response response=http.get();
		
		int statusCode=response.statusCode();
		
		System.out.println(statusCode);
		
		String statusLine=response.getStatusLine();
		
		
		
		System.out.println(statusLine);
		
		long responseTime=response.getTime();
		
		System.out.println(responseTime);
		
		String responseBody=response.body().asString();
		
		System.out.println( responseBody);
		
	}
	

}
