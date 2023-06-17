package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLoginPage_Assert {
	@Test(priority = 0)
	public void verifyValidLoginPage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/login.do");

		Thread.sleep(3000);

		String loginPageTitle = driver.getTitle();

		// actual - Selenium, expected - Manual Test Case

		Assert.assertEquals(loginPageTitle, "aaaaaaaaaa"); // static method

		Thread.sleep(2000);
		driver.close();

	}

	@Test(priority = 1)
	public void verifyValidLoginPage1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/login.do");

		Thread.sleep(3000);

		String loginPageTitle = driver.getTitle();

		// expected - Manual Test Case, actual - Selenium

		Assert.assertEquals(loginPageTitle, "actiTIME - Login"); // static method

		Thread.sleep(2000);
		driver.close();

	}

}
