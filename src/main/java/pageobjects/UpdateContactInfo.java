package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverFactory;
import base.Loggers;
import base.SetupDriver;

public class UpdateContactInfo extends SetupDriver {
	 private  Action ac = new Action(DriverFactory.getDriver());
	public By fname=(By.xpath("//input[@id='customer.firstName']"));
	public By lname=(By.xpath("//input[@id='customer.lastName']"));
	public By address=(By.xpath("//input[@id='customer.address.street']"));

	public By city=(By.xpath("//input[@id='customer.address.city']"));

	public By state=(By.xpath("//input[@id='ccustomer.address.state']"));
	public By zipcode=(By.xpath("//input[@id='customer.firstName']"));
	public By phone=(By.xpath("//input[@id='customer.phoneNumber']"));
	public By update_btn=(By.xpath("//input[@class='button']"));
	
	public void typeFname(String firstname) {
		 
		ac.explicitWaitTillElementVisibility(fname, 5);
		ac.typing(this.fname, firstname);
		Loggers.logger.info("type first name");
	}
	
	public void typeLname(String lastname) {
		 
		ac.explicitWaitTillElementVisibility(lname, 5);
		ac.typing(lname, lastname);
		Loggers.logger.info("type last name");
	}
	
	
	public void typeAddress(String adress) {
		 
		ac.explicitWaitTillElementVisibility(address, 5);
		ac.typing(address, adress);
		Loggers.logger.info("type addresss");
	}
	
	
	public void typeCity(String city) {
		 
		ac.explicitWaitTillElementVisibility(this.city, 5);
		ac.typing(this.city, city);
		Loggers.logger.info("type city");
	}
	
	
	public void typeState(String state) {
		 
		ac.explicitWaitTillElementVisibility(this.state, 5);
		ac.typing(this.state, state);
		Loggers.logger.info("type state");
	}
	
	
	public void typeZipCOde(String zip) {
		 
		ac.explicitWaitTillElementVisibility(zipcode, 5);
		ac.typing(zipcode, zip);
		Loggers.logger.info("type zipcode");
	}
	
	public void typePhone(String phone) {
		 
		ac.explicitWaitTillElementVisibility(this.phone, 5);
		ac.typing(this.phone, phone);
		Loggers.logger.info("type phone number");
	}
	
	public void clickUpdate() {
		 
		ac.explicitWaitTillElementVisibility(update_btn, 5);
		ac.click(update_btn);
		Loggers.logger.info("click on update btn");
	}
	
	public void navigateToPage() {
		HomePage homepage = new HomePage();
		LogInForm loginform=new LogInForm();
		AccountServiceLinks servicelinks=new AccountServiceLinks();
		homepage.navigateToPage();
		loginform.typeUserName("hhh");
		loginform.typePassword("hhh");
		loginform.clickLogin();
		servicelinks.clcikUpdateContactInfo();
		Loggers.logger.info("navigate to home page then sign in then click update contact info link");

	}
}
