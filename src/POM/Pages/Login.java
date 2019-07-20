package POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Commonpackage.Configuration;

public class Login extends Configuration {
	
	//WebElements For Login
	@FindBy(id="txtUsername")
	WebElement UseName;
	
	@FindBy(id="txtPassword")
	WebElement PassWord;
	
	@FindBy(id="btnLogin")
	WebElement LoginButton;
	
	public HomePage login(String Username, String Password) {
		
		
		UseName.sendKeys(Username);
		PassWord.sendKeys(Password);
		LoginButton.click();
		
		return new HomePage();
		
	}
	
	
	
	
	
	public Login() {	
		
		PageFactory.initElements(driver, this);
	}
}


