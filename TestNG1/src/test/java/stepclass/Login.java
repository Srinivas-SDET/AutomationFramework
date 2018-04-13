package stepclass;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver driver;
	
	@Given("^I should be on login page$")
	public void I_should_be_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Sri/Desktop/New folder/chromedriver1/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

	@When("^I see title of login page is free crm$")
	public void i_see_title_of_login_page_is_free_crm() throws Throwable {
	String Title = driver.getTitle();
	
	}

	@Then("^user enter username and password then click login$")
	public void user_enter_username_and_password_then_click_login() throws Throwable {
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		driver.findElement(By.id("email")).sendKeys("00112233@gmail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("passwd")).sendKeys("00112233");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("SubmitLogin")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Wait.until(ExpectedConditions.titleIs("My account - My Store"));
	}

	@Then("^I close the browser$")
	public void I_close_the_browser() throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement locator = driver.findElement(By.xpath("//input[@type='submit']"));
		//WebElement loc = driver.findElement(By.className("topnavlink"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", locator);
		//driver.getCurrentUrl().endsWith("abc");
	 
	}
	
}
