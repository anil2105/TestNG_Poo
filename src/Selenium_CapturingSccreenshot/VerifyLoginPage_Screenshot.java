package Selenium_CapturingSccreenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginPage_Screenshot
{
	
	public static WebDriver driver;
	
	@Test(priority = 0)
	public void loginPage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Program files\\chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Test(priority = 1)
	public void moveToAccountsAndLists()
	{
		Actions action=new Actions(driver);
		
		WebElement move = driver.findElement(By.id("nav-link-accountList"));
	
		action.moveToElement(move).perform();
		
		Assert.assertEquals("abc", "xyz");
	
	}
	
	@Test(priority = 2)
	public void clickOnSignInButton()
	{
		driver.findElement(By.xpath("//div[@id='nav-al-signin']/div/a//span")).click();
		
		Assert.assertEquals("abc", "xyz");
	}
	
	@Test(priority = 3)
	public void enterLoginCredentials()
	{
		driver.findElement(By.id("ap_email")).sendKeys("anil.krtg@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("ap_password")).sendKeys("1234567");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		
	}
	
}