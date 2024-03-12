package Sample1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Fake2 {

	public static void main(String[] args) {

         
		
		RestAssured.baseURI="https://freetestapi.com/api/v1/politicians/1";
		
		RequestSpecification http=RestAssured.given();
		
		http.header("Content-Type","application/json");
		
	    Response response=	http.get();
	    
	   int statuscode= response.getStatusCode();
	   
	   System.out.println(statuscode);
	   
	   
	  String statusLine= response.getStatusLine();
	  
	  System.out.println(statusLine);

	  long resonseTime=response.getTime();
	  
	  System.out.println(resonseTime);
	  
	  String responseBody=response.body().asString();
	  
	  System.out.println(responseBody);
	  
	JsonPath json=response.jsonPath();
	
int ass=json.getInt("id");

System.out.println(ass);
	
	String a=json.getString("dob");
	
	System.out.println(a);
			 
	  
	}

}
