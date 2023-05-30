package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.Action;
import base.Loggers;
import base.SetupDriver;

public class BillPayPage extends SetupDriver{
	
	public By Payeename_field = (By.xpath("//input[@name='payee.name']"));
	
	public By address_field = (By.xpath("//input[@name='payee.address.street']"));
	
	public By city_field = (By.xpath("//input[@name='payee.address.city']"));
	
	
	public By state_field = (By.xpath("//input[@name='payee.address.state']"));
	
	public By zipcode_field = (By.xpath("//input[@name='payee.address.zipCode']"));
	
	public By phone_field = (By.xpath("//input[@name='payee.phoneNumber']"));
	
	public By account_field = (By.xpath("//input[@name='payee.accountNumber']"));
	
	public By verify_account_field = (By.xpath("//input[@name='verifyAccount']"));
	
	
	public By amount_field = (By.xpath("//input[@name='amount']"));
	
	public By from_accout_selection = (By.xpath("//select[@name='fromAccountId']"));
	
	
	public By send_payment_btn = (By.xpath("//input[@name='Send Payment']"));
	
	// initialize all elements
	public BillPayPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void typePayeeName(String name) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(Payeename_field, 5);
		ac.typing(Payeename_field, name);
		Loggers.logger.info("type payee name");
	}
	
	public void typeAdress(String address) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(address_field, 5);
		ac.typing(address_field, address);
		Loggers.logger.info("type address");
	}
	
	
	public void typeCity(String city) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(city_field, 5);
		ac.typing(city_field, city);
		Loggers.logger.info("type city");
	}
	public void typeState(String state) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(state_field, 5);
		ac.typing(state_field, state);
		Loggers.logger.info("type state");
	}
	
	public void typeZipCode(String zipcode) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(zipcode_field, 5);
		ac.typing(zipcode_field, zipcode);
		Loggers.logger.info("type zipcode");
	}
	
	public void typeAccount(String account) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(account_field, 5);
		ac.typing(account_field, account);
		Loggers.logger.info("type account");
	}
	
	
	public void typeAccountVerification(String account) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(verify_account_field, 5);
		ac.typing(verify_account_field, account);
		Loggers.logger.info("type account verification");
	}
	
	
	public void typeAmount(String amount) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(amount_field, 5);
		ac.typing(amount_field, amount);
		Loggers.logger.info("type amount");
	}
	public void clickSend() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(send_payment_btn, 5);
		ac.click(send_payment_btn);
		Loggers.logger.info("click on send_payment_btn");
	}
	public void navigateToPage() {
		HomePage homepage = new HomePage();
		LogInForm loginform=new LogInForm();
		AccountServiceLinks servicelinks=new AccountServiceLinks();
		homepage.navigateToPage();
		loginform.typeUserName("hhh");
		loginform.typePassword("hhh");
		loginform.clickLogin();
		servicelinks.clcikBillPay();
		Loggers.logger.info("navigate to home page then sign in then click bil pay service");

	}
}
