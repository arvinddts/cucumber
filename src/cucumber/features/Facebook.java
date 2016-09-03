package cucumber.features;

import static org.junit.Assert.assertNotNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebook {
	
	WebDriver webDriver=null;
	ChromeOptions options=null;
	String url = "http://www.facebook.com";
	WebElement WebElement = null;
	
	
	@Given("^Iam on facebook login page$")
	public void iam_on_gmail_login_page() throws Throwable {
		options = new ChromeOptions();
  		options.addArguments("chrome.switches","--disable-extensions");
  		System.setProperty("webdriver.chrome.driver", "C:/seleniumdrivers/chromedriver.exe");
		webDriver = new ChromeDriver(options);
		webDriver.get(url);
	    
	}

	@When("^I insert wrong username and password$")
	public void i_insert_wrong_username_and_password_in_gmail() throws Throwable {
	     
		webDriver.findElement(By.id("email")).sendKeys("abcd");
		webDriver.findElement(By.id("pass")).sendKeys("abcd");
		webDriver.findElement(By.id("loginbutton")).click();
		
		
	}

	@Then("^I should see proper error message$")
	public void i_should_see_proper_error_in_gmail() throws Throwable {
		WebElement = webDriver.findElement(By.xpath("//span[text()='Log in to Facebook']"));
		assertNotNull(WebElement);	
	     
	}

//	@And("^close the browser$")
//	public void close_the_browser_in_gmail() throws Throwable {
//	     
//		webDriver.close();
//	}



}
