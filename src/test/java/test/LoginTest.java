package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;


public class LoginTest {

	WebDriver driver;
	
	@Test
	@Parameters({"username","password"})
	public void validlogInUser(String  name,String password) {
		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.insertUserName(name);
		loginPage.insertPassword(password);
		loginPage.submit();

	}
	
	//@Test
	public void invalidlogInUser(String name,String password) {
		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.insertUserName(name);
		loginPage.insertPassword(password);
		loginPage.submit();

	}

}
