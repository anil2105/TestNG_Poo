package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 
{
	@Test
	public void testCase1()
	{
		Reporter.log("TestCase-1");
	}
	
	@Test
	public void testCase2()
	{
		Reporter.log("TestCase-2", true);
	}
	
	@Test
	public void testCase3()
	{
		Reporter.log("TestCase-3", true);
	}
	
}
