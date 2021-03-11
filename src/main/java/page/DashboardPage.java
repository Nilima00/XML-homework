package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage extends BasePge {
	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Dashboard')]")
	WebElement DashBoard_Header;
	/*
	 * @FindBy(how = How.XPATH, using = "//span[contains(text(),'Customers')]")
	 * WebElement Customers;
	 * 
	 * @FindBy(how = How.XPATH, using = "//a[contains(text(),'Add Customer')]")
	 * WebElement Add_Customer;
	 */

	/*
	 * @FindBy(how = How.XPATH, using = "//a[contains(text(),'List Customers')]")
	 * WebElement List_Customer;
	 */
	public void DashboardTitle() {
		waitForElement(driver, 20, DashBoard_Header);
		DashBoard_Header.click();
	}

	/*
	 * public void Clickoncustomers() { waitForElement(driver, 20,Customers );
	 * Customers.click(); }
	 * 
	 * public void Addcustomers() { waitForElement(driver, 30, Add_Customer);
	 * Add_Customer.click(); }
	 */

	/*
	 * public void Listcustomers() { waitForElement(driver, 60, List_Customer);
	 * List_Customer.click(); }
	 */
}