   package neoStoxTestClasses;

import org.testng.annotations.Test;

import neoStoxBase.Base;
import neoStoxPOMClasses.HomePage;
import neoStoxPOMClasses.LoginPage;
import neoStoxPOMClasses.Passworldpage;
import utility.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateUserName extends Base
{
	LoginPage login;
	Passworldpage passworld;
	HomePage home;
	
	
	  @BeforeClass
	  public void  launchNeoStox() 
	  {
		  launchChromeNeoStox();
		  login = new LoginPage(driver);
		  passworld = new Passworldpage(driver);
		  home = new HomePage(driver);
		  
		  
	  }
 
  
  @BeforeMethod
  public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  login.sendMobileNumber(driver, Utility.readDataFromProperty("MobileNumber"));
	  login.clikonsinginButton();
	  Utility.wait(driver, 1);
	  passworld.sendpassworld(driver,Utility.readDataFromProperty("PassWorld"));
	  passworld.clikonsubmitebutton(driver);
	  Utility.wait(driver, 3);
	  home.popUpHandle(driver);
  }

  
  
  @Test
  public void validatingeUserName() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.getUserName(driver), Utility.readDataFromProperty("UserName"), "TC failed actual and exapted user name not same");
	  
	  
  }
  
  @Test
  public void validatingeBalence() throws EncryptedDocumentException, IOException 
  {
	  
	Assert.assertNotNull(home.getbalence(driver),"TC is failed Balence is null");
	  
	  
  }
  
  @AfterMethod
  public void logout() throws InterruptedException 
  {
	  Utility.wait(driver, 1);
	  home.logout(driver);
	  
	  
  }

  @AfterClass
  public void closeApplication() 
  {
	  
	  closeBrowser();
	  
  }

}
