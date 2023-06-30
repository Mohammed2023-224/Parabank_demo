package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverFactory;
import base.Loggers;
import base.SetupDriver;
import io.qameta.allure.Step;

public class BillPayPage extends SetupDriver{
	 private  Action ac = new Action(DriverFactory.getDriver());
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
	

	@Step("Typing payee name ")
	public void typePayeeName(String name) {
		ac.explicitWaitTillElementVisibility(Payeename_field, 5);
		ac.typing(Payeename_field, name);
		Loggers.logger.info("type payee name");
	}
	@Step("Typing address ")
	public void typeAdress(String address) {
		ac.explicitWaitTillElementVisibility(address_field, 5);
		ac.typing(address_field, address);
		Loggers.logger.info("type address");
	}
	
	@Step("Typing state ")
	public void typeCity(String city) {
		ac.explicitWaitTillElementVisibility(city_field, 5);
		ac.typing(city_field, city);
		Loggers.logger.info("type city");
	}
	@Step("Typing state")
	public void typeState(String state) {
		ac.explicitWaitTillElementVisibility(state_field, 5);
		ac.typing(state_field, state);
		Loggers.logger.info("type state");
	}
	@Step("typing zip code ")
	public void typeZipCode(String zipcode) {
		ac.explicitWaitTillElementVisibility(zipcode_field, 5);
		ac.typing(zipcode_field, zipcode);
		Loggers.logger.info("type zipcode");
	}
	@Step("typing account in account field")
	public void typeAccount(String account) {
		ac.explicitWaitTillElementVisibility(account_field, 5);
		ac.typing(account_field, account);
		Loggers.logger.info("type account");
	}
	
	@Step("typing account name in verication field ")
	public void typeAccountVerification(String account) { 
		ac.explicitWaitTillElementVisibility(verify_account_field, 5);
		ac.typing(verify_account_field, account);
		Loggers.logger.info("type account verification");
	}
	
	@Step("typing amount ")
	public void typeAmount(String amount) {	 
	ac.explicitWaitTillElementVisibility(amount_field, 5);
		ac.typing(amount_field, amount);
		Loggers.logger.info("type amount");
	}
	@Step("clicking on send payment button ")
	public void clickSend() {	 
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
	}
}
