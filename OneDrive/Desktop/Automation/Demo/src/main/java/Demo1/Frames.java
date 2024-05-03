package Demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		
//		Enter topic as API Automation
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("API Automation");

		
		
//		select the avatar from drop down
		WebElement wb=driver.findElement(By.xpath("//select[@id=\"animals\"]//option[4]"));
		
		Select sel=new Select(wb);
		sel.selectByVisibleText("Avatar");
		
		
		driver.switchTo().frame("frame2");
		
		
//		select the cat from drop down
		driver.findElement(By.xpath("//select[@id=\"animals\"]//option[1]"));
		
		sel.selectByVisibleText("Cat");
		
		
//		unselect the checkbox 
//		clear the topic and enter UI Automation
		
		driver.switchTo().parentFrame();
		
		WebElement wb1=driver.findElement(By.xpath("//input[@type=\"text\"]"));
		wb1.clear();
		
		
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("UI Automation");
	
		
	}

}
