package Util;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Dropdown extends BaseClass {
	
	public static void selectByVisibleText(WebElement wb, String value)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
		WebElement wb3=wait.until(ExpectedConditions.visibilityOf(wb));
		
		Select sel=new Select(wb3);
		sel.selectByVisibleText(value);
	}

}
