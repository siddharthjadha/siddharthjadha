package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.Utility;



public class Passworldpage 
{
	
	@FindBy (xpath = "//input[@id='txt_accesspin']")private WebElement passworldfild;
	
	@FindBy (xpath = "//a[@id='lnk_submitaccesspin']")private WebElement submitebutton;
	
	public Passworldpage (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	public void sendpassworld(WebDriver driver, String pass)
	{
		Utility.wait(driver, 2);
		passworldfild.sendKeys(pass);
		Reporter.log("sending passworld ", true);
		
	}
	
	public void clikonsubmitebutton(WebDriver driver)
	{
		Utility.wait(driver, 2);
		submitebutton.click();
		Reporter.log("clicking on submite Button", true);
	}

}
