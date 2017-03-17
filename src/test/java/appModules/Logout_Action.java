package appModules;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.MainAccount_Menu;
public class Logout_Action {
	public static void Execute(WebDriver driver) throws Exception {
		Assert.assertTrue(driver.getTitle().matches("Trusted by traders.*"));
		MainAccount_Menu.link_MainAccount(driver).click();
		MainAccount_Menu.link_Logout(driver).click();
	}
}
