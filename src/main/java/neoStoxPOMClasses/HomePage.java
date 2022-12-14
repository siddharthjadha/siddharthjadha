package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.Utility;



public class HomePage 
{
	@FindBy (id = "lbl_username")private WebElement username; 
	
	@FindBy (id = "lbl_curbalancetop")private WebElement balence;
	
	@FindBy (xpath = "(//a[text()='Close'])[5]")private WebElement close;
	
	@FindBy (xpath = "(//a[@class='btn btn-sm neobutton'])[7]")private WebElement ok;
	
	@FindBy (xpath = "//a[@id='lnk_logout']")private WebElement logoutbutton;
	
	
	public HomePage (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public String getUserName (WebDriver driver)
	{
		Utility.wait(driver, 2);
		String actualusername = username.getText();
		System.out.println(username.getText());
		Reporter.log("getting username ", true);
		return actualusername;
		
	}
	
	public String getbalence (WebDriver driver)
	{
		Utility.wait(driver, 2);
		String chekingbalence = balence.getText();
		Reporter.log("getting balence ", true);
		return chekingbalence;
		
	}
	
	public void popUpHandle (WebDriver driver)
	{
		if (ok.isDisplayed())
		{
			Utility.wait(driver, 2);
			ok.click();
			close.click();
			Reporter.log("Closing PopUp",true);
		}
		else {
			
			Reporter.log("Close");
		}
		
	}
	
	public void logout (WebDriver driver)
	{
		Utility.wait(driver, 2);
		username.click();
		Utility.wait(driver, 1);
		logoutbutton.click();
		Reporter.log("logging out",true);
		
	}
	
	



}