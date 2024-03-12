package Sample1;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo3 {

	public static void main(String[] args) {
		
		// Specify the Base URI in Rest Assured
				RestAssured.baseURI = "http://localhost:3000/employees/2";

				// get the RequestSpecification object so we add request header, request body
				// and we can select the HTTP PATCH Request.
				RequestSpecification httpRequest = RestAssured.given();

				// add request Content-Type header from RequestSpecification object
				httpRequest.header("Content-Type", "application/json");

				// create Request body in JSON format by using JSON simple library
				JSONObject json = new JSONObject();
				json.put("firstName", "Dushyant");

				//Convert JSONObject into String by using toString method
				String xyz =json.toString();
				
				//attach converted JSON string into the HTTP PATCH Request.
				httpRequest.body(xyz);
				
				//select HTTP PATCH Request from RequestSpecification Object
				Response response = httpRequest.patch();
				
				//capture status code by using Response Object.
				int a = response.statusCode();
				int b = response.getStatusCode();
				System.out.println(a);
				System.out.println(b);
				
				//capture status line by using Response Object
				String c = response.statusLine();
				String d = response.getStatusLine();
				System.out.println(c);
				System.out.println(d);
				System.out.println("------------------------------------");
				//capture response time by using Response Object.
				long e = response.time();
				System.out.println(e);
				long f = response.getTime();
				System.out.println(f);
				long g = response.getTimeIn(TimeUnit.SECONDS);
				System.out.println(g);
				
				String responseBody=response.body().asString();
				
				System.out.println(responseBody);
				

	}

}
