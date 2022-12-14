package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility 
{
	
	public static String readDataFromExle (int row , int cell) throws EncryptedDocumentException, IOException
	{
		
		File myfile = new File("C:\\Users\\AUTOMATION\\selenium\\book3.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("entering data from excel ", true);
        return value;

	}
	
	
	public static void takeSceenShot (WebDriver driver, String filename ) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dist = new File("D:\\New folder\\"+filename+".jpg");	
		FileHandler.copy(source, dist);	
		Reporter.log("taking screenshot ",true);
		
	}
	
	
	public static void scrollIntoViwe (WebDriver driver, WebElement element)
	{
		JavascriptExecutor js =  (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true)",element);
	    
	    Reporter.log("scrolling into view "+element.getText(),true);
		
	}
	
	public static void wait (WebDriver driver, int waittime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(waittime));
		
		
	}
	
	public static String readDataFromProperty (String key) throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream myfile = new FileInputStream("C:\\Users\\sidja\\eclipse-workspace\\Mymavan\\myProperties.properties"); 
		
		prop.load(myfile);
		
		String value = prop.getProperty(key);
		
		Reporter.log("reading value of "+key+" from property file",true);
		
		return value;
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
