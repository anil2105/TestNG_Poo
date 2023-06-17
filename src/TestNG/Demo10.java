package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo10 
{
	@Test
	public void loginCreateTestCase1()
	{
		Reporter.log("LoginCreateTestCase-1", true);
	}
	
	@Test(dependsOnMethods = {"loginCreateTestCase1"})
	public void composeEditTestCase2()
	{
		Reporter.log("ComposeEditTestCase-2", true);
	}
	
	@Test(dependsOnMethods = {"loginCreateTestCase1","composeEditTestCase2"} )
	public void sentMailDeleteTestCase3()
	{
		Reporter.log("SentmailDeleteTestCase-3", true);
	}
}
