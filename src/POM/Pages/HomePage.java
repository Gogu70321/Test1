package POM.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Commonpackage.Configuration;

public class HomePage extends Configuration {

	@FindBy(id = "welcome")
	WebElement WelcomeText;

	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement adminLink;

	public void verifyHomePage() {

		String stext = WelcomeText.getText();

		Assert.assertEquals(stext, "Welcome Admin");

	}

	public    AdminPage navigaeToAdminpage() {

		adminLink.click();
		
		return new AdminPage();

	}

	public HomePage() {

		PageFactory.initElements(driver, this);

	}

}
