package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.Action;
import base.Loggers;
import base.SetupDriver;

public class TransferFundsPage extends SetupDriver {
	public By amount_field=(By.xpath("//input[@id='amount']"));

	public By from_account_selection=(By.xpath("//select[@id='fromAccountId']"));
	
	public By to_account_selection=(By.xpath("//select[@id='toAccountId']"));
	

	public By trabsfer_btn=(By.xpath("//input[@class='button' and @value='Transfer']"));
	
	
	// initialize all elements
	public TransferFundsPage() {
		PageFactory.initElements(driver, this);
	}	
		public void typeAmount(String amount) {
			Action ac = new Action(driver);
			ac.explicitWaitTillElementVisibility(amount_field, 5);
			ac.typing(amount_field, amount);
			Loggers.logger.info("type amount to transfer");
		}
	public void transferClick() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(trabsfer_btn, 5);
		ac.click(trabsfer_btn);
		Loggers.logger.info("click transfer btn");
	}
	
	public void navigateToPage() {
		HomePage homepage = new HomePage();
		LogInForm loginform=new LogInForm();
		AccountServiceLinks servicelinks=new AccountServiceLinks();
		homepage.navigateToPage();
		loginform.typeUserName("hhh");
		loginform.typePassword("hhh");
		loginform.clickLogin();
		servicelinks.clcikTransferFunds();
		Loggers.logger.info("navigate to home page then sign in then click transfer funds link");

	}
}
