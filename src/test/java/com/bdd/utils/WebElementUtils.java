package com.bdd.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUtils {

	WebDriver driver;
	WebElement element;
	
	public WebElementUtils(WebDriver driver){
		this.driver=driver;
	}
	
	public void setInput(WebElement element, String value, String name){
		
		element.sendKeys(value);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TakeScreenShot.captureScreenshot(driver, name);
	}
	
	public WebElement getElement(String path, String locator){
		if(path.equals("xpath")){
			element=driver.findElement(By.xpath(locator));
		}
		
		return element;
	}
}
