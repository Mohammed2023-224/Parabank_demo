package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverFactory;
import base.Loggers;
import base.SetupDriver;
import io.qameta.allure.Step;

public class AccountServiceLinks extends SetupDriver {
	
    private  Action   ac = new Action(DriverFactory.getDriver());
	//new account link
		public By open_new_account_service = (By.xpath("//a[text()='Open New Account']"));
	//account overview link
		public By account_over_view_service = (By.xpath("//a[text()='Accounts Overview']"));
	//transfer funds link
		public By transfer_funds_service = (By.xpath("//a[text()='Transfer Funds']"));
	//bill pay link
		public By bill_pay_service = (By.xpath("//a[text()='Bill Pay']"));
	//find transactions link
		public By find_transaction_service = (By.xpath("//a[text()='Find Transactions']"));
	//update contact link
		public By update_contact_service = (By.xpath("//a[text()='Update Contact Info']"));
	//request loan link
		public By request_loan_service = (By.xpath("//a[text()='Request Loan']"));
	//log out link
		public By log_out_service = (By.xpath("//a[text()='Log Out']"));
		@Step("clicking on new accounts link ")
		public void clcikNewAccounts() {
			ac.explicitWaitTillElementVisibility(open_new_account_service, 5);
			ac.click(open_new_account_service);
			Loggers.logger.info("click on new accounts link");
		}
		@Step("clicking on overview link ")
		public void clcikOverView() {
			ac.explicitWaitTillElementVisibility(account_over_view_service, 5);
			ac.click(account_over_view_service);
			Loggers.logger.info("click on account overview link");
		}
		@Step("clicking on transfer funds link ")
		public void clcikTransferFunds() {
			ac.explicitWaitTillElementVisibility(transfer_funds_service, 5);
			ac.click(transfer_funds_service);
			Loggers.logger.info("click on transfer funds link");
		}
		@Step("clicking on loan requesr link ")
		public void clcikLoanRequest() { 
			ac.explicitWaitTillElementVisibility(request_loan_service, 5);
			ac.click(request_loan_service);
			Loggers.logger.info("click on request  loan link");
		}
		@Step("clicking on log out button ")
		public void clcikLogOut() {
			ac.explicitWaitTillElementVisibility(log_out_service, 5);
			ac.click(log_out_service);
			Loggers.logger.info("click on logout link");
		}
		@Step("clicking on update contact info link ")
		public void clcikUpdateContactInfo() {
			ac.explicitWaitTillElementVisibility(update_contact_service, 5);
			ac.click(update_contact_service);
			Loggers.logger.info("click on update contact link");
		}
		@Step("clicking on find transactions link")
		public void clcikFindTransActions() {	 
			ac.explicitWaitTillElementVisibility(find_transaction_service, 5);
			ac.click(find_transaction_service);
			Loggers.logger.info("click on find transactions link");
		}
@Step("clicking on Bill pay ")
		public void clcikBillPay() {
			ac.explicitWaitTillElementVisibility(bill_pay_service, 5);
			ac.click(bill_pay_service);
			Loggers.logger.info("click on bill pay link");
		}
}
