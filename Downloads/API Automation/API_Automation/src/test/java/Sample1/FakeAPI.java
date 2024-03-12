package Sample1;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FakeAPI {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts";
		
		RequestSpecification http=RestAssured.given();
		
		http.header("Content-Type","application/json");
		
		JSONObject obj=new JSONObject();
		
//		{
//	        "userId": 1,
//	        
//	        "title": "sunt aut facere",
//	        "body": "quia et suscipit\nitecto"
//	    }

//		
		obj.put("userId", "1");
		
		obj.put("title", "sun");
		obj.put("body", "sandhya");
		
		String requestbody=obj.toString();
		
		http.body(requestbody);
		
	   Response resp=	http.post();
	   
	   int a=resp.statusCode();
	   
	   System.out.println(a);
	   
	   String b=resp.statusLine();
	   
	   System.out.println(b);
	   
	  String str= resp.body().asString();
	  
	  System.out.println(str);
	}

}

