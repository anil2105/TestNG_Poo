package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 
{

	@Test(priority = 0)
	public void createTestCase1()
	{
		Reporter.log("CreateTestCase-1", true);
	}
	
	@Test(priority = 1)
	public void editTestCase2()
	{
		Reporter.log("EditTestCase-2", true);
	}
	
	@Test(priority = 2)
	public void deleteTestCase3()
	{
		Reporter.log("DeleteTestCase-3", true);
	}

}
