package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo11 
{
	@Test
	public void loginCreateTestCase1()
	{
		Reporter.log("LoginCreateTestCase-1", true); //pass
	}
	
	@Test(dependsOnMethods = {"loginCreateTestCase1"})
	public void composeEditTestCase2()
	{
		Reporter.log("ComposeEditTestCase-2", true); //fail
		Assert.fail();
	}
	
	@Test(dependsOnMethods = {"loginCreateTestCase1","composeEditTestCase2"} )
	public void sentMailDeleteTestCase3()
	{
		Reporter.log("SentmailDeleteTestCase-3", true); //skip
	}
}
