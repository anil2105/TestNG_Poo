package Selenium_CapturingSccreenshot;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class CapturingScreenshot extends TestListenerAdapter 
{
	public void onTestFailure(ITestResult tr)	
	{
		File scrFile = ((TakesScreenshot)VerifyLoginPage_Screenshot.driver).getScreenshotAs(OutputType.FILE);
						//Now you can do whatever you need to do with it, for example copy somewhere
	
		try 
		{
			FileUtils.copyFile(scrFile, new File("C:\\Users\\Admin\\Desktop\\Amzon_Failed_Test_Script_Screenshot\\"+tr.getName()+".png"));
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}

	}
}