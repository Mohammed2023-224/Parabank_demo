package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverFactory;
import base.Loggers;
import base.SetupDriver;

public class RequestLoan extends SetupDriver{

	public By loan_amount=(By.xpath("//input[@id='amount']"));
	
	public By down_payment=(By.xpath("//input[@id='downPayment']"));

	
	public By from_account_selection=(By.xpath("//select[@id='fromAccountId']"));
	
	public By request_btn=(By.xpath("//input[@class='button']"));

	public void clicApplyBtn() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(request_btn, 5);
		ac.click(request_btn);
		Loggers.logger.info("click onapply btn");
	}
	
	public void typeLoanAmount(String amount) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(loan_amount, 5);
		ac.typing(loan_amount, amount);
		Loggers.logger.info("type loan amount");
	}
	
	public void typeDownPayment(String amount) {
		Action ac = new Action(DriverFactory.getDriver());
		ac.explicitWaitTillElementVisibility(down_payment, 5);
		ac.typing(down_payment, amount);
		Loggers.logger.info("type down payment");
	}
	public void navigateToPage() {
		HomePage homepage = new HomePage();
		LogInForm loginform=new LogInForm();
		AccountServiceLinks servicelinks=new AccountServiceLinks();
		homepage.navigateToPage();
		loginform.typeUserName("hhh");
		loginform.typePassword("hhh");
		loginform.clickLogin();
		servicelinks.clcikLoanRequest();
		Loggers.logger.info("navigate to home page then sign in then click request loan link");

	}

}
