package Sample1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo1 {

	public static void main(String[] args) {
		
RestAssured.baseURI="http://localhost:3000/employees";
		
		RequestSpecification httprequest=RestAssured.given();
		
		Response resp=httprequest.get();
		
		int abc=resp.getStatusCode();
		
		System.out.println(abc);
		
		String r=resp.getStatusLine();
		
		System.out.println(r);
		
		long ann=resp.getTime();
		System.out.println(ann);
		
//		String body=resp.body().toString();
//		
//		System.out.println(body);

	}

}
