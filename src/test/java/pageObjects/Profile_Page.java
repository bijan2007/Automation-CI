package pageObjects;

import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Profile_Page {
	private static WebElement element = null;
	public static WebElement link_PersonalDetails(WebDriver driver) throws Exception{
		WebDriverWait wait = new WebDriverWait(driver,10);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='settings_Container']/div/div[1]/div[2]/h4/a")));
		Assert.assertTrue(element.isDisplayed());
		return element;
	}
	public static WebElement link_FinancialAssessment(WebDriver driver) throws Exception{
			WebDriverWait wait = new WebDriverWait(driver,10);
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='settings_container']/div/div[2]/div[2]/h4/a")));
			Assert.assertTrue(element.isDisplayed());
		return element;
	}
}

