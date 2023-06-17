package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo7 
{
	@Test(priority = 1, enabled = false)
	public void createTestCase1()
	{
		Reporter.log("CreateTestCase-1", true);
	}
	
	@Test(priority = 1) //enabled = true
	public void editTestCase2()
	{
		Reporter.log("EditTestCase-2", true);
	}
	
	@Test(priority = 1, enabled =  false)
	public void deleteTestCase3()
	{
		Reporter.log("DeleteTestCase-3", true);
	}
}
