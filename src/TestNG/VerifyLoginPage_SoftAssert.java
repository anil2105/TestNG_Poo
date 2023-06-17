package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyLoginPage_SoftAssert {
	@Test(priority = 0)
	public void verifyValidLoginPage() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/login.do");

		SoftAssert soft = new SoftAssert();

		Thread.sleep(3000);

		String loginPageTitle = driver.getTitle();

		// expected - Manual Test Case, actual - Selenium

		soft.assertEquals(loginPageTitle, "aaaaaaaaaaaa"); // non-static method or instance method

		Thread.sleep(2000);
		driver.close();

		soft.assertAll();

	}

	@Test(priority = 1)
	public void verifyValidLoginPage1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/login.do");

		SoftAssert soft = new SoftAssert();

		Thread.sleep(3000);

		String loginPageTitle = driver.getTitle();

		// expected - Manual Test Case, actual - Selenium

		soft.assertEquals(loginPageTitle, "actiTIME - Login"); // non-static method or instance method

		Thread.sleep(2000);
		driver.close();

		//soft.assertAll();

	}

}
