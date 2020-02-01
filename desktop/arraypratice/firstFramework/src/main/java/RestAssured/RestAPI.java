package RestAssured;



import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;




public class RestAPI {
	WebDriver dr;
	RequestSpecification request;
	Response response;
	
	
	@Test
	
	public void restWebsurvices() {
	  request=RestAssured.given();
	  request.header("Content-Type","application/json");
	  JSONObject json=new JSONObject();
	  json.put("id","19");
	  json.put("title","manager");
	  json.put("author","shamim");
	  
	 
	  request.body(json.toJSONString());
	   response=request.post("http://localhost:3000/posts");
	  int code=response.getStatusCode();
	  Assert.assertEquals(code, 201 );
	  
	  
	  
	}
@Test
	void getmethod() {
	response.getStatusLine();
	response.getBody().asString();
	double a=response.getTime();
	String server=response.header("server");
	response.header("Content-Type");
	response.header("content-Lenth");
	Response code=	request.get("www.facebook.com/asma/pic");
	System.out.println(code);
		
	}
}
