package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObjects.Login_Page;
import utility.Constant;
import appModules.Login_Action;

public class Validate_LoginWithIncorrectPassword {
	public WebDriver driver;
	  @Test
	  public void A_Login_IncorrectPassword() throws Exception {
		  	String password = "Pass1234";
		  	Login_Action.Execute(driver,Constant.Email,password);
	  }
	  @Test
	  public void B_Validate_Message() throws Exception {
		  AssertJUnit.assertTrue(Login_Page.err_Login(driver).isDisplayed());
		  if(Login_Page.err_Login(driver).isDisplayed()){
			  System.out.println(Login_Page.err_Login(driver).getText());
			  AssertJUnit.assertEquals("Incorrect email or password.",Login_Page.err_Login(driver).getText());
		  }
	  }
	  @BeforeTest
	  public void launchApplication() {
		  	ChromeDriverManager.getInstance().setup();
	    	driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(Constant.URL);
	  }
	  @AfterTest
	  public void endSession() {
		  driver.quit();
	  }
}