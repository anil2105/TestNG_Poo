package Selenium_TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Inheritance_In_TestNG extends BaseTest
{
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
