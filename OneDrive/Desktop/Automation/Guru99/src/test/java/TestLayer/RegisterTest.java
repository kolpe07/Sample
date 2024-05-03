package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLyer.Guru99registeruser;

public class RegisterTest extends BaseClass {
	
	
	@BeforeTest
	public void setup()
	{
	  BaseClass.intilization();
	}
	
	@Test
	public void validateRegisterFunctionlity()
	{
		Guru99registeruser registerpage=new Guru99registeruser();
		registerpage.createGuru99User("Sandhya", "kolpe", "89009989", "sandhya@gmail.com", "Warje", "Pune", "Maharashtra", "415003", "INDIA", "sanhdya@gmail.com", "Sandhya@123", "Sandhya@123");
		
	}

	@AfterTest
	public void tearDown()
	{
		//driver.quit
	}
}
