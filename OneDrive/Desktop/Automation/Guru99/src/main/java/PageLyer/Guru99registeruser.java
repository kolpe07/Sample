package PageLyer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import Util.Dropdown;
import Util.Wait;

public class Guru99registeruser extends BaseClass {
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	
	@FindBy(name="phone")
	private WebElement phone;
	
	
	@FindBy(name="userName")
	private WebElement email;
	
	
	@FindBy(name="address1")
	private WebElement address;
	
	
	@FindBy(name="city")
	private WebElement city;
	
	
	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(name="postalCode")
	private WebElement postalcode;
	
	@FindBy(name="country")
	private WebElement country;
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="confirmPassword")
	private WebElement confirmpassword;
	
	public Guru99registeruser()
	{
		PageFactory.initElements(driver, this);

	}
	
	public void createGuru99User(String firstname, String lastnamename, String phoneno, String emailId, String Address,String City, String State, String PostalCode, String Country,String Uname, String pass, String confirmpass )
	{
		Wait.sendKeys(fname, firstname);
		Wait.sendKeys(lname, lastnamename);
		Wait.sendKeys(phone, phoneno);
		Wait.sendKeys(email, emailId);
		Wait.sendKeys(address, Address);
		Wait.sendKeys(city, City);
		Wait.sendKeys(state, State);
		Wait.sendKeys(postalcode, PostalCode);
		Dropdown.selectByVisibleText(country, Country);
		Wait.sendKeys(username, Uname);
		Wait.sendKeys(password, pass);
		Wait.sendKeys(confirmpassword, confirmpass);
	}

}
