package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Home_Page;
import utility.Constant;
import appModules.Login_Action;
import appModules.Logout_Action;

public class Validate_LoginAndLogout {
	
public WebDriver driver;

	@BeforeTest
    public void setUp() {
    	ChromeDriverManager.getInstance().setup();
    	driver = new ChromeDriver();   
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(Constant.URL);
    	}
	 
  @Test
  public void A_Launch(){
	  driver.get(Constant.URL); 
	  System.out.println("Page title is: " + driver.getTitle());
  }
	
  @Test
  public void B_Login() {
	  	Login_Action.Execute(driver,Constant.Email,Constant.Password);
  }
  @Test
  public void C_Logout() {
		Logout_Action.Execute(driver);
		AssertJUnit.assertTrue(Home_Page.btn_Login(driver).isDisplayed());
  }
  
  @AfterTest
  public void endSession() {
	  driver.quit();
	  
  }

}
