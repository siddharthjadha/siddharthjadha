package listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import neoStoxBase.Base;
import utility.Utility;

public class Listener extends Base implements ITestListener 
{
	
	
	public void onTestSuccess(ITestResult result)
	{
		
		Reporter.log("TC is completed successfuly", true);
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("TC is failed "+result.getName(),true);
		
		try {
			Utility.takeSceenShot(driver, "TC is "+result.getName()+" failed ");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		
	Reporter.log("TC is skipped please check",true);
	
	}

	
	

}
