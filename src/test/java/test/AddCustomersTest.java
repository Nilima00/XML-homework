package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import page.AddCustomerForm;
import page.DashboardPage;
import page.List_Customer_Page;
import page.LoginPage;
import util.BrowserFactory;


public class AddCustomersTest {

	WebDriver driver;

	String name = null;
	String password = null;
	String fullname = null;
	String email = null;
	String address = null;
	String city = null;
	String zip = null;

	@Test
	@Parameters({"username","password","FullName","Email","Address", "City","Zip"})
	public void customersform(String name,String password,String fullname,String email,String address,String city,String zip) {
		driver = BrowserFactory.init();

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.insertUserName(name);
		loginPage.insertPassword(password);
		loginPage.submit();

		DashboardPage dashboard = PageFactory.initElements(driver, DashboardPage.class);
		dashboard.DashboardTitle();
		// dashboard.Clickoncustomers();
		// dashboard.dashboard.Addcustomers();

		AddCustomerForm addcustomer = PageFactory.initElements(driver, AddCustomerForm.class);
		addcustomer.Clickoncustomers();
		addcustomer.Addcustomers();
		System.out.println("=======" + fullname);
		addcustomer.FULLNAME(fullname);
		addcustomer.emailfield(email);

		addcustomer.Addressfield(address);
		// addcustomer.CITYNAME(city);
		addcustomer.ZIPCODE(zip);
		addcustomer.ClickOnSubmit();

		List_Customer_Page listcustom = PageFactory.initElements(driver, List_Customer_Page.class);
		listcustom.Activity();
		listcustom.Listcustomers();
		// listcustom.Customer_buttonListcustomers();
		// listcustom.varifyEnteredName();
		addcustomer.varifyEnteredName();
		listcustom.DeleteCustomerConfarmationButton();

	}

}
