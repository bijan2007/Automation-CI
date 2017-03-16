package pageObjects;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
	
public class MainAccount_Menu {
		private static WebElement element = null;
		public static WebElement link_Profile(WebDriver driver) throws Exception{
			try{
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='all-accounts']/li/ul/a[1]")));
			}catch (Exception e){
				System.out.println("Profile link element is not found");
				throw(e);
			}
			return element;
		}
		public static WebElement link_Security(WebDriver driver) throws Exception{
			try{
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='all-accounts']/li/ul/a[2]")));
			}catch (Exception e){
				System.out.println("Security link element is not found");
				throw(e);
			}
			return element;
		}
		public static WebElement link_Logout(WebDriver driver) throws Exception{
			try{
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='btn_logout']")));
			}catch (Exception e){
				System.out.println("Logout link element is not found");
				throw(e);
			}
			return element;
		}
		public static WebElement link_MainAccount(WebDriver driver) throws Exception{
			try{
			WebDriverWait wait = new WebDriverWait(driver,30);
			element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='main-logout']")));
			}catch (Exception e){
				System.out.println("Main Account link element is not found");
				throw(e);
			}
			return element;
		}
}
