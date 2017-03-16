package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinancialAssessment_Page {
	private static WebElement element = null;
	//driver is being passed an argument so that selenium is able to locate the element on the browser
	public static WebElement select_ForexTradingExperience(WebDriver driver) throws Exception{
		//driver will wait for the element to be clickable before performing any action
		try{
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("forex_trading_experience")));
		}catch (Exception e){
			System.out.println("Forex Trading Experience select element is not found");
			throw(e);
		}
			//element is returned so that an action can be performed in it
		return element;
	}
	public static WebElement select_ForexTradingFrequency(WebDriver driver) throws Exception{
		try{ 
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("forex_trading_frequency")));
		}catch (Exception e){
			System.out.println("Forex Trading Frequency select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_IndicesTradingExperience(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("indices_trading_experience")));
		}catch (Exception e){
			System.out.println("Indices Trading Experience select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_IndicesTradingFrequency(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("indices_trading_frequency")));
		}catch (Exception e){
			System.out.println("Forex Trading Frequency select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_CommoditiesTradingExperience(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("commodities_trading_experience")));
		}catch (Exception e){
			System.out.println("Commodities Trading Experience select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_CommoditiesTradingFrequency(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("commodities_trading_frequency")));
		}catch (Exception e){
			System.out.println("Commodities Trading Frequency select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_StocksTradingExperience(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("stocks_trading_experience")));
		}catch (Exception e){
			System.out.println("Stocks Trading Experience select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_StocksTradingFrequency(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("stocks_trading_frequency")));
		}catch (Exception e){
			System.out.println("Stocks Trading Frequency select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_OtherDerivatiesTradingExperience(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("other_derivatives_trading_experience")));
		}catch (Exception e){
			System.out.println("OtherDerivatives Trading Experience select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_OtherDerivatiesTradingFrequency(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("other_derivatives_trading_frequency")));
		}catch (Exception e){
			System.out.println("OtherDerivatives Trading Frequency select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_OtherTradingExperience(WebDriver driver) throws Exception{
		try{ 
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("other_instruments_trading_experience")));
		}catch (Exception e){
			System.out.println("Other Trading Experience select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_OtherTradingFrequency(WebDriver driver) throws Exception{
		try{ 
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("other_instruments_trading_frequency")));
		}catch (Exception e){
			System.out.println("Other Trading Frequency select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_IndustryEmployment(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("employment_industry")));
		}catch (Exception e){
			System.out.println("Industry Employment select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_Occupation(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("occupation")));
		}catch (Exception e){
			System.out.println("Industry Employment select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_Education(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("education_level")));
		}catch (Exception e){
			System.out.println("Education select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_IncomeSource(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("income_source")));
		}catch (Exception e){
			System.out.println("Income Source select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_AnnualIncome(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("net_income")));
		}catch (Exception e){
			System.out.println("Annual Income select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_NetWorth(WebDriver driver) throws Exception{
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("estimated_worth")));
		}catch (Exception e){
			System.out.println("Net Worth select element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement btn_Update(WebDriver driver) throws Exception {
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_submit")));
		}catch (Exception e){
			System.out.println("Update button element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement msg_Success(WebDriver driver) throws Exception {
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@id,'msg_form')]")));
		}catch (Exception e){
			System.out.println("Success message element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement msg_NoChanges(WebDriver driver) throws Exception {
		try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='form_message']")));
		} catch (Exception e){
			System.out.println("No Changes message element is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement error_ForexTradingExperience(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[1]/div[2]/div")));
		return element;
	}
	public static WebElement error_ForexTradingFrequency(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[2]/div[2]/div")));
		return element;
	}
	public static WebElement error_IndicesTradingExperience(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[3]/div[2]/div")));
		return element;
	}
	public static WebElement error_IndicesTradingFrequency(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[4]/div[2]/div")));
		return element;
	}
	public static WebElement error_CommoditiesTradingExperience(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[5]/div[2]/div")));
		return element;
	}
	public static WebElement error_CommoditiesTradingFrequency(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[6]/div[2]/div")));
		return element;
	}
	public static WebElement error_StocksTradingExperience(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[7]/div[2]/div")));
		return element;
	}
	public static WebElement error_StocksTradingFrequency(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[8]/div[2]/div")));
		return element;
	}
	public static WebElement error_OtherDerivatiesTradingExperience(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[9]/div[2]/div")));
		return element;
	}
	public static WebElement error_OtherDerivatiesTradingFrequency(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[10]/div[2]/div")));
		return element;
	}
	public static WebElement error_OtherTradingExperience(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[11]/div[2]/div")));
		return element;
	}
	public static WebElement error_OtherTradingFrequency(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[12]/div[2]/div")));
		return element;
	}
	public static WebElement error_IndustryEmployment(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[13]/div[2]/div")));
		return element;
	}
	public static WebElement error_Occupation(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[14]/div[2]/div")));
		return element;
	}
	public static WebElement error_Education(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[15]/div[2]/div")));
		return element;
	}
	public static WebElement error_IncomeSource(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[16]/div[2]/div")));
		return element;
	}
	public static WebElement error_AnnualIncome(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[17]/div[2]/div")));
		return element;
	}
	public static WebElement error_NetWorth(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[18]/div[2]/div")));
		return element;
	}
	

}
