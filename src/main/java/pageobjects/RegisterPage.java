package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverFactory;
import base.Loggers;
import base.SetupDriver;

public class RegisterPage extends SetupDriver {

	// registration form first name field
	public By account_created_message = (By.xpath("//h1[@class='title']"));
	
	// registration form first name field
	public By first_name_field = (By.xpath("//table[@class='form2']//descendant::input[@id='customer.firstName']"));
	// registration form error message
	public By error_message = (By.xpath("//table[@class='form2']//descendant::span[@id='customer.username.errors']"));
	// registration form last name field
	public By last_name_field = (By.xpath("//table[@class='form2']//descendant::input[@id='customer.lastName']"));

	// registration form street field
	public By address_field = (By.xpath("//table[@class='form2']//descendant::input[@id='customer.address.street']"));
	// registration form city name field
	public By city_field = (By.xpath("//table[@class='form2']//descendant::input[@id='customer.address.city']"));
	// registration form state field
	public By state_field = (By.xpath("//table[@class='form2']//descendant::input[@id='customer.address.state']"));

	// registration form zip code field
	public By zipcode_field = (By.xpath("//table[@class='form2']//descendant::input[@id='customer.address.zipCode']"));
	// registration form phone field
	public By phone_field = (By.xpath("//table[@class='form2']//descendant::input[@id='customer.phoneNumber']"));
	// registration form ssn field
	public By ssn_field = (By.xpath("//table[@class='form2']//descendant::input[@id='customer.ssn']"));
	// registration form user name field
	public By user_name_field_registration = (By
			.xpath("//table[@class='form2']//descendant::input[@id='customer.username']"));

	// registration form password field
	public By password_field_registration = (By
			.xpath("//table[@class='form2']//descendant::input[@id='customer.password']"));
	// registration form repeat password field
	public By repeat_password_field = (By.xpath("//table[@class='form2']//descendant::input[@id='repeatedPassword']"));
	// registration form submit btn
	public By submit_register_btn = (By.xpath("//table[@class='form2']//descendant::input[@class='button']"));
  //
	public By missmatchpasswordmesssage= (By.id("repeatedPassword.errors"));
	public By required_password_message= (By.id("customer.password.errors"));

	
	public void typeFormUserName(String username) {

		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(user_name_field_registration, 5);
		ac.typing(user_name_field_registration, username);
		Loggers.logger.info("type user name in registration form");
	}

	public void typeFormPassword(String pass) {
		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(password_field_registration, 5);
		ac.typing(password_field_registration, pass);
		Loggers.logger.info("type password in registration form");
	}

	public void typeFormCity(String city) {
		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(city_field, 5);
		ac.typing(city_field, city);
		Loggers.logger.info("type city in registration form");
	}

	public void typeFormAddress(String street) {
		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(address_field, 5);
		ac.typing(address_field, street);
		Loggers.logger.info("type address in registration form");
	}

	public void typeFormState(String state) {
		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(state_field, 5);
		ac.typing(state_field, state);
		Loggers.logger.info("type state in registrarion form");
	}

	public void typeZipCode(String zipcode) {
		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(zipcode_field, 5);
		ac.typing(zipcode_field, zipcode);
		Loggers.logger.info("type zipcode in registration form");
	}

	public void typePhone(String phone) {
		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(phone_field, 5);
		ac.typing(phone_field, phone);
		Loggers.logger.info("type phone is registration form");
	}

	public void typeSSN(String ssn) {
		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(ssn_field, 5);
		ac.typing(ssn_field, ssn);
		Loggers.logger.info("type ssn in registration form");
	}

	public void typeFormFirstName(String fname) {
		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(first_name_field, 5);
		ac.typing(first_name_field, fname);
		Loggers.logger.info("type first name in registran form");
	}

	public void typeFormLastName(String lname) {
		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(last_name_field, 5);
		ac.typing(last_name_field, lname);
		Loggers.logger.info("type last name in registration form");
	}

	public void typeFormRepeatPassworf(String pass) {
		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(repeat_password_field, 5);
		ac.typing(repeat_password_field, pass);
		Loggers.logger.info("type passworn confirmation in registration form");
	}

	public void clickFormSubmitBtn() {
		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(submit_register_btn, 5);
		ac.click(submit_register_btn);
		Loggers.logger.info("click on submit form btn");
	}

	public void navigateToPage() {
		LogInForm loginform = new LogInForm();
		DriverFactory.getDriver().navigate().to(SetupDriver.prop.getProperty("Home_page"));

		loginform.clickRegister();
		Loggers.logger.info("Navigate to Register page");
	}

	public String errorTextExtract() {
		return DriverFactory.getDriver().findElement(error_message).getText();
	}

}
