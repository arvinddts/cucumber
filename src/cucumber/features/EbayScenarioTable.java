package cucumber.features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.junit.Assert.*;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbayScenarioTable {
	
	WebDriver webDriver=null;
	ChromeOptions options=null;
	String url = "http://www.ebay.com";
	WebElement WebElement = null;
	
	
	
	
	@Given("^st Iam on home page$")
	public void iam_on_home_page() throws Throwable {		
		
		webDriver.get(url);
	}
	
	@When("^st I navigate to ([^\"]*) page$")
	public void i_navigate_to_page(String link) throws Throwable {
		webDriver.findElement(By.xpath("//a[text()='"+link+"']")).click();
	     
	}

	@Then("^st I check contents of the ([^\"]*) page$")
	public void i_check_contents_of_the_page(String title) throws Throwable {
		assertTrue(webDriver.getTitle().contains(title));
	     

	}
	

}
