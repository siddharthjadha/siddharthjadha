package neoStoxPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.Utility;



public class LoginPage 
{
    @FindBy (xpath = "//input[@id='MainContent_signinsignup_txt_mobilenumber']") private WebElement mobileNumField;
	
	@FindBy (xpath = "//a[@id='lnk_signup1']")private WebElement singinbutton;



public LoginPage  (WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}


public void sendMobileNumber(WebDriver driver, String mobno)
{
	Utility.wait(driver, 2);
	mobileNumField.sendKeys(mobno);
	Reporter.log("sending mobile nomber", true);
	
}
	
	public void clikonsinginButton()
	{
		
		singinbutton.click();
		Reporter.log("clicking on sign in Button", true);
	}
	
	

}
