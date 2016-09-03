package cucumber.features;

import static org.testng.AssertJUnit.assertNotNull;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookRegistration {

	WebDriver webDriver=null;
	ChromeOptions options=null;
	String url = "http://www.facebook.com";
	WebElement WebElement = null;

	@Given("^Iam on facebook home page$")
	public void iam_on_facebook_home_page() throws Throwable {
		options = new ChromeOptions();
		options.addArguments("chrome.switches","--disable-extensions");
		System.setProperty("webdriver.chrome.driver", "C:/seleniumdrivers/chromedriver.exe");
		webDriver = new ChromeDriver(options);
		webDriver.get(url);
		webDriver.manage().window().maximize();	

	}

	@When("^I give user registration details$")
	public void i_give_user_registration_details(DataTable tb) throws Throwable {
		
		List<List<String>> data=tb.raw();
		
		WebElement=webDriver.findElement(By.name("firstname"));		 
		WebElement.sendKeys(data.get(1).get(1));
		Thread.sleep(2000);
		WebElement=webDriver.findElement(By.name("lastname"));		 
		WebElement.sendKeys(data.get(2).get(1));
		WebElement=webDriver.findElement(By.name("reg_email__"));		 
		WebElement.sendKeys(data.get(3).get(1));
		WebElement=webDriver.findElement(By.name("reg_email_confirmation__"));		 
		WebElement.sendKeys(data.get(4).get(1));
		WebElement=webDriver.findElement(By.name("reg_passwd__"));		 
		WebElement.sendKeys(data.get(5).get(1));		
		List<?> webElements=webDriver.findElements(By.name("sex"));		 
		WebElement=(WebElement) webElements.get(Integer.parseInt(data.get(6).get(1)));		 
		WebElement.click(); 
		WebElement=webDriver.findElement(By.name("birthday_day"));
		Select date = new Select(WebElement);
		date.selectByVisibleText(data.get(7).get(1));
		WebElement=webDriver.findElement(By.name("birthday_month"));
		Select month = new Select(WebElement);
		month.selectByVisibleText(data.get(8).get(1));		
		WebElement=webDriver.findElement(By.name("birthday_year"));
		Select year = new Select(WebElement);
		year.selectByVisibleText(data.get(9).get(1));  
		WebElement=webDriver.findElement(By.name("websubmit"));
		WebElement.click();


	}

	@Then("^I should see error message user already exist$")
	public void i_should_see_error_message_user_already_exist() throws Throwable {
		Thread.sleep(3000);
		WebElement=webDriver.findElement(By.xpath("//div[text()='Please choose a more secure password. It should be longer than 6 characters, unique to you and difficult for others to guess.']"));
		assertNotNull(WebElement);  
	}

}
