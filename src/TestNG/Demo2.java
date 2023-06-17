package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
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
