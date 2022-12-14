package neoStoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import utility.Utility;



public class Base
{

	protected WebDriver driver ;
	
	public void launchChromeNeoStox()
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\AUTOMATION\\selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://neostox.com/sign-in");
		
		Reporter.log("Launching browser",true);
		Utility.wait(driver, 1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	}
	
	
	public void launchFirefoxNeoStox ()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AUTOMATION\\selenium\\geckodriver.exe");
		   
	    driver= new FirefoxDriver();
	    driver.manage().window().maximize();
		driver.get("https://neostox.com/sign-in");
		
		Reporter.log("Launching browser",true);
		Utility.wait(driver, 1000);
		
	
	}
	
	public void launchChromeNeoStoxByProperties() throws IOException
	{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\AUTOMATION\\selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility.readDataFromProperty("URL"));
		
		Reporter.log("Launching browser",true);
		Utility.wait(driver, 1);
		
			
	}
	
	
	public void closeBrowser ()
	{
		
		Utility.wait(driver, 2);
		driver.close();
		Reporter.log("closing browser", true);
		
	}
	
	
	
}
