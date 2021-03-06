package testCases;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.ChromeDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObjects.FinancialAssessment_Page;
import pageObjects.MainAccount_Menu;
import pageObjects.Profile_Page;
import utility.Constant;
import appModules.Login_Action;
import appModules.SetFinancialAssessment_Action;

public class Validate_FinancialAssessmentFields {
	public WebDriver driver;
	
	  @Test(priority=0)
	  public void Login() throws Exception {
		  	Login_Action.Execute(driver,Constant.Email,Constant.Password);
	  }  
	  @Test(priority=1)
	  public void NavigateToFinancialAssessmentPage() throws Exception {
		  	MainAccount_Menu.link_MainAccount(driver).click();
			MainAccount_Menu.link_Profile(driver).click();
			Profile_Page.link_FinancialAssessment(driver).click();
	  }
	  @Test(priority=2)
	  public void Test_ForexTradingExperience() throws Exception {
		  SetFinancialAssessment_Action.Execute(driver, Constant.select_value, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_ForexTradingExperience(driver).isDisplayed()){
				System.out.println("Field validation for forex trading experience is working");
			}
	  }
	  @Test(priority=3)
	  public void Test_ForexTradingFrequency() throws Exception {
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.select_value, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_ForexTradingFrequency(driver).isDisplayed()){
				System.out.println("Field validation for forex trading frquency is working");
			}
	  }
	  @Test(priority=4)
	  public void Test_IndicesTradingExperience() throws Exception {
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.select_value, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_IndicesTradingExperience(driver).isDisplayed()){
				System.out.println("Field validation for forex trading frquency is working");
			}
	  }
	  @Test(priority=5)
	  public void Test_IndicesTradingFrequency() throws Exception {
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.select_value, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_IndicesTradingFrequency(driver).isDisplayed()){
				System.out.println("Field validation for Indices trading frequency is working");
			}
	  }
	  @Test(priority=6)
	  public void Test_CommoditiesTradingExperience() throws Exception {
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.select_value, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_CommoditiesTradingExperience(driver).isDisplayed()){
				System.out.println("Field validation for Commodities trading experience is working");
			}
	  }
	  @Test(priority=7)
	  public void Test_CommoditiesTradingFrequency() throws Exception{
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.select_value, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_CommoditiesTradingFrequency(driver).isDisplayed()){
				System.out.println("Field validation for Commodities trading frequency is working");
			}
	  }
	  @Test(priority=8)
	  public void Test_StocksTradingExperience() throws Exception{
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.select_value, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_StocksTradingExperience(driver).isDisplayed()){
				System.out.println("Field validation for Stocks trading experience is working");
			}
	  }
	  @Test(priority=9)
	  public void Test_StocksTradingFrequency() throws Exception{
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.select_value, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_StocksTradingFrequency(driver).isDisplayed()){
				System.out.println("Field validation for Stocks trading frequency is working");
			}
	  }
	  @Test(priority=10)
	  public void Test_OtherTradingExperience() throws Exception{
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.select_value, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_OtherTradingExperience(driver).isDisplayed()){
				System.out.println("Field validation for Binary options or other financial derivatives trading experience is working");
			}
	  }
	  @Test(priority=11)
	  public void Test_OtherTradingFrequency() throws Exception{
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.select_value, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_OtherTradingFrequency(driver).isDisplayed()){
				System.out.println("Field validation for Binary options or other financial derivatives trading frequency is working");
			}
	  }
	  @Test(priority=12)
	  public void Test_OtherDerivatiesTradingExperience() throws Exception{
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.select_value, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_OtherDerivatiesTradingExperience(driver).isDisplayed()){
				System.out.println("Field validation for Other financial instruments trading experience is working");
			}
	  }
	  @Test(priority=13)
	  public void Test_OtherDerivatiesTradingFrequency() throws Exception{
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.select_value, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_OtherDerivatiesTradingFrequency(driver).isDisplayed()){
				System.out.println("Field validation for Other financial instruments trading frequency is working");
			}
	  }
	  @Test(priority=14)
	  public void Test_IndustryEmployment() throws Exception{
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.select_value, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_IndustryEmployment(driver).isDisplayed()){
				System.out.println("Field validation for Industry of Employment is working");
			}
	  }
	  @Test(priority=15)
	  public void Test_Occupation() throws Exception{
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.select_value,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_Occupation(driver).isDisplayed()){
				System.out.println("Field validation for Occupation is working");
			}
	  }
	  @Test(priority=16)
	  public void Test_Education() throws Exception{
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.select_value, Constant.income_source, Constant.annual_income, Constant.net_worth);
			if(FinancialAssessment_Page.error_Education(driver).isDisplayed()){
				System.out.println("Field validation for Education is working");
			}
	  }
	  @Test(priority=17)
	  public void Test_AnnualIncome() throws Exception{
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.select_value, Constant.net_worth);
			if(FinancialAssessment_Page.error_AnnualIncome(driver).isDisplayed()){
				System.out.println("Field validation for Annual Income is working");
			}
	  }
	  @Test(priority=18)
	  public void Test_NetWorth() throws Exception{
		  SetFinancialAssessment_Action.Execute(driver, Constant.fx_trading_exerience, Constant.fx_trading_frequency, Constant.indices_trading_experience, 
					Constant.indices_trading_frequency, Constant.commodities_trading_experience, Constant.commodities_trading_frequency, 
					Constant.stocks_trading_experience, Constant.stocks_trading_frequency, Constant.other_trading_experience, Constant.other_trading_frequency, 
					Constant.other_derivative_trading_experience, Constant.other_derivative_trading_frequency, Constant.employment_industry, Constant.occupation,
					Constant.education, Constant.income_source, Constant.annual_income, Constant.select_value);
			if(FinancialAssessment_Page.error_NetWorth(driver).isDisplayed()){
				System.out.println("Field validation for Net Worth is working");
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