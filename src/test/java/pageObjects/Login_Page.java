package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
	private static WebElement element = null;
	public static WebElement txt_Email(WebDriver driver) throws Exception{
	try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtEmail")));
	}catch (Exception e){
		System.out.println("Email text field element is not found");
		throw(e);
	}
		return element;
	}
	public static WebElement txt_Password(WebDriver driver) throws Exception{
	try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txtPass")));
	}catch (Exception e){
		System.out.println("Password text field element is not found");
		throw(e);
	}
		return element;
	}
	public static WebElement btn_Login(WebDriver driver) throws Exception{
	try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
	} catch (Exception e){
		System.out.println("Login button element is not found");
		throw(e);
	}
		return element;
	}
	public static WebElement err_Login(WebDriver driver) throws Exception{
	try{
		WebDriverWait wait = new WebDriverWait(driver,30);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='frmLogin']/p")));
	}catch (Exception e){
		System.out.println("Login error element is not found");
		throw(e);
	}
		return element;
	}
}
