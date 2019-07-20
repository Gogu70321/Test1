package POM.POM.Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Commonpackage.Configuration;
import POM.Pages.HomePage;
import POM.Pages.Login;

public class VerifyLoginandDashboard extends Configuration{

	Login oLogin;
	HomePage oHomePage;

	
	
	@BeforeTest
	public void checkLogin() {
		oLogin = new Login();
		oHomePage=oLogin.login("Admin", "admin123");
		
		
	}

	@Test
	public void VeifyLogin() {
		
		oHomePage = new HomePage();
		oHomePage.verifyHomePage();
		oHomePage.navigaeToAdminpage();

	}

}
