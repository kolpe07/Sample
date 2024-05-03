package StepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM {

	static WebDriver driver;
	
	@Given("user is on login page")
	public void  Given_user_is_on_login_page()
	{
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3000));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
	   
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}

	@Then("user is on home page and validate home page title")
	public void user_is_on_home_page_and_validate_home_page_title() {
	    
		String homepagetitle=driver.getTitle();
		System.out.println(homepagetitle);
	}

	@Then("user validate home page URL")
	public void user_validate_home_page_url() {
	    
		String homepageurl=driver.getCurrentUrl();
		Assert.assertEquals(homepageurl.contains("hrm"), true);
	}
	

	@When("user click on pim link")
	public void user_click_on_pim_link() {
	    driver.findElement(By.xpath("//span[text()='PIM']")).click();
	}

	@Then("validate user is on pim page")
	public void validate_user_is_on_pim_page() {
	 String pimpageurl= driver.getCurrentUrl();
	 Assert.assertEquals(pimpageurl.contains("pim"),true);
	}

	@Then("click on add employee")
	public void click_on_add_employee() {
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	}
	    	

	@Then("user enter firstname middle and last name")
	public void user_enter_firstname_middle_and_last_name() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sandhya");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Shankar");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("kolpe");
		
	}
	

	@Then("click on save button")
	public void click_on_save_button() {
	    
			driver.findElement(By.xpath("//button[text()=' Save ']")).click();
		
}
}