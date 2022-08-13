package Selenium_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyLoginPage_SoftAssert 
{
	@Test
	public void verifyValidLoginPage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("http://localhost/login.do");
		
		SoftAssert soft=new SoftAssert();
		
		driver.manage().window().maximize();	
		
		
		Thread.sleep(3000);
		
		String loginPageTitle = driver.getTitle(); 
		
					    //expected - Manual Test Case, actual - Selenium
		
		soft.assertEquals(loginPageTitle, "aaaaaaaaaaaa"); //non-static method or instance method
		
		Thread.sleep(2000);
		driver.close();
		
		//soft.assertAll();
	
	}
	
	@Test
	public void verifyValidLoginPage1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("http://localhost/login.do");
		
		SoftAssert soft=new SoftAssert();
		
		driver.manage().window().maximize();	
		
		Thread.sleep(3000);
		
		String loginPageTitle = driver.getTitle(); 
		
					    //expected - Manual Test Case, actual - Selenium
		
		soft.assertEquals(loginPageTitle, "actiTIME - Login"); //non-static method or instance method
		
		Thread.sleep(2000);
		driver.close();
		
		soft.assertAll();
	
	}
		
}
