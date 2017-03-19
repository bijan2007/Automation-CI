package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.MainAccount_Menu;
public class Logout_Action {
	public static void Execute(WebDriver driver) throws Exception {
		System.out.println(driver.getTitle());
		MainAccount_Menu.link_MainAccount(driver).click();
		MainAccount_Menu.link_Logout(driver).click();
	}
}
