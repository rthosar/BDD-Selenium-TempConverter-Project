package com.bdd.specs;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bdd.utils.TakeScreenShot;
import com.bdd.utils.WebElementUtils;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TempConverterStepdef {

	WebDriver driver;
	WebElement we;
	TakeScreenShot screenshot;
	WebElementUtils webutils;
	@Before
	public void setUp(){
		System.setProperty("webdriver.gecko.driver","src/test/resources/Driver/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html");
		webutils=new WebElementUtils(driver);
	}
	
	@After
	public void cleanUp(){
		driver.close();
	}
	@Given("click on {string}")
	public void click_on(String button) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		if(button.equals("Reset")){
			
			we=webutils.getElement("xpath","//button[@title='Reset']");
			we.click();
		}else if(button.equals("Convert")){
			//we=driver.findElement(By.xpath("//button[@title='Convert']"));
			we=webutils.getElement("xpath","//button[@title='Convert']");
			we.click();
		}
	}

	@Given("Enter the temparature {double} in Centigrade")
	public void enter_the_temparature_in_Centigrade(Double temparatureCentigrade) {
	  
		//we=driver.findElement(By.xpath("//input[@id='x']"));
		we=webutils.getElement("xpath","//input[@id='x']");
		webutils.setInput(we, temparatureCentigrade.toString(),"TemperatureInCentigrade");
		//we.sendKeys(temparatureCentigrade.toString());
		
	}

	
	@Then("the temparature should be equal to {double} Fahrenheit")
	public void the_temparature_should_be_equal_to_Fahrenheit(Double expectedTemp) {
	    //we=driver.findElement(By.xpath("//input[@name='y']"));
		we=webutils.getElement("xpath","//input[@name='y']");
		String actualTemp = we.getAttribute("value");
		System.out.println("Actual Temparature in Fahrenheit: "  +Double.parseDouble(actualTemp) );
		System.out.println("Expected Temparature in Fahrenheit: "  +expectedTemp );
		assertEquals(expectedTemp,Double.parseDouble(actualTemp),0);
		screenshot.captureScreenshot(driver, "TemparatureInFahrenheit");
		
		we=webutils.getElement("xpath","//textarea[@name='TA']");
		System.out.println("Calculation :" + we.getAttribute("value"));
	}

}
