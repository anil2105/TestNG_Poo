package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest 
{
	@BeforeSuite
	public void bs()
	{
		Reporter.log("@BeforeSuite",true);
	}
	
	@AfterSuite
	public void as()
	{
		Reporter.log("@AfterSuite", true);
	}
	
	@BeforeClass
	public void openApp()
	{
		Reporter.log("OpenApp",true);
	}
	
	@AfterClass
	public void closeApp()
	{
		Reporter.log("CloseApp",true);
	}
	
	@BeforeMethod
	public void login()
	{
		Reporter.log("Login",true);
	}
	
	@AfterMethod
	public void logout()
	{
		Reporter.log("logout",true);
	}
}
