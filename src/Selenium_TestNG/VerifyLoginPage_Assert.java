package Selenium_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyLoginPage_Assert 
{
	@Test
	public void verifyValidLoginPage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("http://localhost/login.do"); 
		
		driver.manage().window().maximize();	
		
		Thread.sleep(3000);
		
		String loginPageTitle = driver.getTitle(); 
		
					//actual - Selenium, expected - Manual Test Case
		
		Assert.assertEquals(loginPageTitle, "aaaaaaaaaa"); //static method
		
		Thread.sleep(2000);
		driver.close();
	
	}
	
	@Test
	public void verifyValidLoginPage1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get("http://localhost/login.do");
		
		driver.manage().window().maximize();	
		
		Thread.sleep(3000);
		
		String loginPageTitle = driver.getTitle(); 
		
					       //expected - Manual Test Case, actual - Selenium
		
		Assert.assertEquals(loginPageTitle, "actiTIME - Login"); //static method
		
		Thread.sleep(2000);
		driver.close();
		
	}
		
}
