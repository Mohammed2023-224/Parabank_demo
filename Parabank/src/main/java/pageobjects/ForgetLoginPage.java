package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverIdentify;
import base.Loggers;
import base.SetupDriver;

public class ForgetLoginPage extends DriverIdentify {


	// forget login form first name field
	public By first_name_field = (By.xpath("//table[@class='form2']//descendant::input[@id='firstName']"));

	// forget login form last name field
	public By last_name_field = (By.xpath("//table[@class='form2']//descendant::input[@id='lastName']']"));

	// forget login form street field
	public By address_field = (By.xpath("//table[@class='form2']//descendant::input[@id='address.street']"));
	// forget login form city name field
	public By city_field = (By.xpath("//table[@class='form2']//descendant::input[@id='address.city']"));
	// forget login form state field
	public By state_field = (By.xpath("//table[@class='form2']//descendant::input[@id='address.state']"));

	// forget login form zip code field
	public By zipcode_field = (By.xpath("//table[@class='form2']//descendant::input[@id='address.zipCode']"));

	// forget login form ssn field
	public By ssn_field = (By.xpath("//table[@class='form2']//descendant::input[@id='ssn']"));
	// forget login form submit btn
	public By find_login_btn = (By.xpath("//table[@class='form2']//descendant::input[@class='button']"));


	public void typeFormCity(String city) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(city_field, 5);
		ac.typing(city_field, city);
		Loggers.logger.info("type city in registration form");
	}
	
	public void typeFormAddress(String street) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(address_field, 5);
		ac.typing(address_field, street);
		Loggers.logger.info("type address in registration form");
	}
	
	public void typeFormState(String state) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(state_field, 5);
		ac.typing(state_field, state);
		Loggers.logger.info("type state in registrarion form");
	}
	
	public void typeZipCode(String zipcode) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(zipcode_field, 5);
		ac.typing(zipcode_field, zipcode);
		Loggers.logger.info("type zipcode in registration form");
	}
	
	
	public void typeSSN(String ssn) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(ssn_field, 5);
		ac.typing(ssn_field, ssn);
		Loggers.logger.info("type ssn in registration form");
	}
	
	public void typeFormFirstName(String fname) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(first_name_field, 5);
		ac.typing(first_name_field, fname);
		Loggers.logger.info("type first name in registran form");
	}
	
	public void typeFormLastName(String lname) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(last_name_field, 5);
		ac.typing(last_name_field, lname);
		Loggers.logger.info("type last name in registration form");
	}
	public void clickFindMyLoginInfo() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(find_login_btn, 5);
		ac.click(find_login_btn);
		Loggers.logger.info("click on find login info btn in registration form");
	}

	public void navigateToPage() {
		LogInForm loginform=new LogInForm();
		driver.navigate().to(SetupDriver.prop.getProperty("Home_page"));

		loginform.clickForgetLoginInfo();
		Loggers.logger.info("Navigate to forget login info page");
	}

}
