package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverIdentify;
import base.Loggers;

public class AccountServiceLinks extends DriverIdentify {
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
		
		public void clcikNewAccounts() {
			Action ac = new Action(driver);
			ac.explicitWaitTillElementVisibility(open_new_account_service, 5);
			ac.click(open_new_account_service);
			Loggers.logger.info("click on new accounts link");
		}

		public void clcikOverView() {
			Action ac = new Action(driver);
			ac.explicitWaitTillElementVisibility(account_over_view_service, 5);
			ac.click(account_over_view_service);
			Loggers.logger.info("click on account overview link");
		}

		public void clcikTransferFunds() {
			Action ac = new Action(driver);
			ac.explicitWaitTillElementVisibility(transfer_funds_service, 5);
			ac.click(transfer_funds_service);
			Loggers.logger.info("click on transfer funds link");
		}

		public void clcikLoanRequest() {
			Action ac = new Action(driver);
			ac.explicitWaitTillElementVisibility(request_loan_service, 5);
			ac.click(request_loan_service);
			Loggers.logger.info("click on request  loan link");
		}

		public void clcikLogOut() {
			Action ac = new Action(driver);
			ac.explicitWaitTillElementVisibility(log_out_service, 5);
			ac.click(log_out_service);
			Loggers.logger.info("click on logout link");
		}

		public void clcikUpdateContactInfo() {
			Action ac = new Action(driver);
			ac.explicitWaitTillElementVisibility(update_contact_service, 5);
			ac.click(update_contact_service);
			Loggers.logger.info("click on update contact link");
		}

		public void clcikFindTransActions() {
			Action ac = new Action(driver);
			ac.explicitWaitTillElementVisibility(find_transaction_service, 5);
			ac.click(find_transaction_service);
			Loggers.logger.info("click on find transactions link");
		}

		public void clcikBillPay() {
			Action ac = new Action(driver);
			ac.explicitWaitTillElementVisibility(bill_pay_service, 5);
			ac.click(bill_pay_service);
			Loggers.logger.info("click on bill pay link");
		}
}
