package stepclass;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login1 {

	WebDriver driver;

	@BeforeClass
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Sri/Desktop/New folder/chromedriver1/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 0)
	public void setup() {
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.className("login")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void sample() {
		System.out.println("Test");
	}

	@Test(priority = 2)
	public void m1() {
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		driver.findElement(By.id("email")).sendKeys("00112233@gmail.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("passwd")).sendKeys("00112233");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("SubmitLogin")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Wait.until(ExpectedConditions.titleIs("My account - My Store"));

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}