package cucumber.features;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbayBase {
	
	WebDriver webDriver=null;
	ChromeOptions options=null;
	String url = "http://www.ebay.com";
	WebElement WebElement = null;
	
	@Given("^parameter Iam on home page$")
	public void iam_on_home_page() throws Throwable {		
		options = new ChromeOptions();
  		options.addArguments("chrome.switches","--disable-extensions");
  		System.setProperty("webdriver.chrome.driver", "C:/seleniumdrivers/chromedriver.exe");
		webDriver = new ChromeDriver(options);
		webDriver.get(url);
		webDriver.manage().window().maximize();	
	}
	
	@When("^parameter I navigate to \"([^\"]*)\" page$")
	public void i_navigate_to_page(String link) throws Throwable {
		webDriver.findElement(By.xpath("//a[text()='"+link+"']")).click();
	     
	}

	@Then("^parameter I check contents of the \"([^\"]*)\" page$")
	public void i_check_contents_of_the_page(String title) throws Throwable {
		assertTrue(webDriver.getTitle().contains(title));
	     

	}
	
	 

}
