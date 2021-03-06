package testCases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObjects.MainAccount_Menu;
import pageObjects.FinancialAssessment_Page;
import pageObjects.Profile_Page;
import utility.Constant;
import appModules.Login_Action;
import appModules.SetFinancialAssessment_Action;

public class Validate_SetFinancialAssessment {	
	public WebDriver driver;
	@Test
	public void A_Login() throws Exception {
		  	Login_Action.Execute(driver,Constant.Email,Constant.Password);
	}
	@Test
	  public void B_NavigateToFinancialAssessmentPage() throws Exception {
		  	MainAccount_Menu.link_MainAccount(driver).click();
			MainAccount_Menu.link_Profile(driver).click();
			Profile_Page.link_FinancialAssessment(driver).click();
	  }
	 @Test
	 public void C_Set_FinancialAssessment() throws Exception {
			SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.msg_Success(driver).isDisplayed()){
				System.out.println(FinancialAssessment_Page.msg_Success(driver).getText());
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
