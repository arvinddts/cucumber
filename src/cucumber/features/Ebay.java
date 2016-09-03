package cucumber.features;

 	

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Ebay {

	WebDriver webDriver=null;
	ChromeOptions options=null;
	String url = "http://www.ebay.com";
	WebElement WebElement = null;
	
	
	@Before("@ebay")
	public void loadBrowser()
	{
		options = new ChromeOptions();
  		options.addArguments("chrome.switches","--disable-extensions");
  		System.setProperty("webdriver.chrome.driver", "C:/seleniumdrivers/chromedriver.exe");
		webDriver = new ChromeDriver(options);		
	}
	 
	
	@Given("^Iam on home page$")
	public void iam_on_home_page() throws Throwable {
			
		webDriver.get(url);
		webDriver.manage().window().maximize();	
	}

	@When("^I navigate to motor page$")
	public void i_navigate_to_motor_page() throws Throwable {
		webDriver.findElement(By.xpath("//a[text()='Motors']")).click();
		
		
	}	 
	
	@Then("^I check contents of the motor page$")
	public void i_check_contents_of_the_motor_page() throws Throwable {
		
		assertTrue(webDriver.getTitle().contains("Motors"));
	    
	}

	@When("^I navigate to fashion page$")
	public void i_navigate_to_fashion_page() throws Throwable {
		webDriver.findElement(By.xpath("//a[text()='Fashion']")).click();
	     
	}

	@Then("^I check contents of the fashion page$")
	public void i_check_contents_of_the_fashion_page() throws Throwable {
	    
		assertTrue(webDriver.getTitle().contains("Fashion"));
	}

	@When("^I navigate to electronics page$")
	public void i_navigate_to_electronics_page() throws Throwable {
		
		webDriver.findElement(By.xpath("//a[text()='Electronics']")).click();
	   
	}

	@Then("^I check contents of the electronics page$")
	public void i_check_contents_of_the_electronics_page() throws Throwable {
		
		assertTrue(webDriver.getTitle().contains("Electronics"));
	   
	}
	
	@And("^close the browser completly$")
	public void close_the_browser_completly() throws Throwable {		
		webDriver.quit();
	   
	}


	

}
