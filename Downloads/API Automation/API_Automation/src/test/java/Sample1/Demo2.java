package Sample1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Demo2 {

	public static void main(String[] args) {


		
		RestAssured.baseURI="http://localhost:3000/data";

		RequestSpecification http=RestAssured.given();
		
		Response resp=http.get();
		
		int a=resp.getStatusCode();
		System.out.println(a);
		
		String b=resp.getStatusLine();
		
		System.out.println(b);
		
		String c=resp.body().toString();
		System.out.println(c);

	}

}
