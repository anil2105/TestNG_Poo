package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_AnnotationEx2
{
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
	 
	@Test
	public void createTestCase1()
	{
		Reporter.log("CreateTestCase-1", true);
	}
	
	@Test
	public void editTestCase2()
	{
		Reporter.log("EditTestCase-2", true);
	}
	
	@Test
	public void deleteTestCase3()
	{
		Reporter.log("DeleteTestCase-3", true);
	}
}
