package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class List_Customer_Page extends BasePge {
	WebDriver driver;

	public List_Customer_Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@id='activity']")
	WebElement Customer_Activity;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'List Customers')]")
	WebElement List_Customer;

	@FindBy(how = How.XPATH, using = "//body/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]")
	WebElement Addcustomer_button_onList_CustomerPage;
	@FindBy(how = How.XPATH, using = "//input[@id='foo_filter']")
	WebElement Seach_button_onListCustomerPage;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'OK')]")
	WebElement DeleteConfirmationButton;

	public void Activity() {
		waitForElement(driver, 30, Customer_Activity);
		Customer_Activity.click();
	}

	public void Listcustomers() {
		waitForElement(driver, 60, List_Customer);
		List_Customer.click();
	}

	public void Customer_buttonListcustomers() {
		waitForElement(driver, 60, Addcustomer_button_onList_CustomerPage);
		Addcustomer_button_onList_CustomerPage.click();
	}

	public void searchonlist(String name) {
		waitForElement(driver, 60, Addcustomer_button_onList_CustomerPage);
		Addcustomer_button_onList_CustomerPage.click();
	}

	public void DeleteCustomerConfarmationButton() {
		waitForElement(driver, 60, DeleteConfirmationButton);
		DeleteConfirmationButton.click();
	}

}
