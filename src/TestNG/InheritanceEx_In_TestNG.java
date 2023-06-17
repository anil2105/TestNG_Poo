package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InheritanceEx_In_TestNG extends BaseTest_Ex
{
	@Test
	public void testCase1() 
	{
		Reporter.log("testCase1", true);
	}
}
