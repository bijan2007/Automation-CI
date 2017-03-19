package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FinancialAssessment_Page {
	private static WebElement element = null;
	public static WebElement select_ForexTradingExperience(WebDriver driver) throws Exception{
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("forex_trading_experience")));
			Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_ForexTradingFrequency(WebDriver driver) throws Exception{ 
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("forex_trading_frequency")));
			Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_IndicesTradingExperience(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("indices_trading_experience")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_IndicesTradingFrequency(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("indices_trading_frequency")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_CommoditiesTradingExperience(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("commodities_trading_experience")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_CommoditiesTradingFrequency(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("commodities_trading_frequency")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_StocksTradingExperience(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("stocks_trading_experience")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_StocksTradingFrequency(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("stocks_trading_frequency")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_OtherDerivatiesTradingExperience(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("other_derivatives_trading_experience")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_OtherDerivatiesTradingFrequency(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("other_derivatives_trading_frequency")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_OtherTradingExperience(WebDriver driver) throws Exception{ 
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("other_instruments_trading_experience")));
			Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_OtherTradingFrequency(WebDriver driver) throws Exception{
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.id("other_instruments_trading_frequency")));
			Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_IndustryEmployment(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("employment_industry")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_Occupation(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("occupation")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_Education(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("education_level")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_IncomeSource(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("income_source")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_AnnualIncome(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("net_income")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement select_NetWorth(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("estimated_worth")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement btn_Update(WebDriver driver) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.id("btn_submit")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement msg_Success(WebDriver driver) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[contains(@id,'msg_form')]")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement msg_NoChanges(WebDriver driver) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='form_message']")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_ForexTradingExperience(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[1]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_ForexTradingFrequency(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[2]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_IndicesTradingExperience(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[3]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_IndicesTradingFrequency(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[4]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_CommoditiesTradingExperience(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[5]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_CommoditiesTradingFrequency(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[6]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_StocksTradingExperience(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[7]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_StocksTradingFrequency(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[8]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_OtherDerivatiesTradingExperience(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[9]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_OtherDerivatiesTradingFrequency(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[10]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_OtherTradingExperience(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[11]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_OtherTradingFrequency(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[12]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_IndustryEmployment(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[13]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_Occupation(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[14]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_Education(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[15]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_IncomeSource(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[16]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_AnnualIncome(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[17]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement error_NetWorth(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frm_assessment']/fieldset[1]/div[18]/div[2]/div")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	

}
