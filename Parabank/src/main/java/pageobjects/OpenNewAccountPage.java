package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.Action;
import base.Loggers;
import base.SetupDriver;

public class OpenNewAccountPage extends SetupDriver {



public By acoount_id_verification=(By.xpath("//h1[@class='title']"));

	//account number selection
	public By accout_number_selection=(By.xpath("//select[@id='fromAccountId']"));
	
	//account type selection
	public By accout_type_selection=(By.xpath("//select[@id='type']"));
	//open new account btn
	public By open_new_account_btn=(By.xpath("//input[@type='submit']"));
	
	
	
	// initialize all elements
	public OpenNewAccountPage() {
		PageFactory.initElements(driver, this);
	}

	

	public void navigateToPage() {
		HomePage homepage = new HomePage();
		LogInForm loginform=new LogInForm();
		AccountServiceLinks opennewaccount=new AccountServiceLinks();
		homepage.navigateToPage();
		loginform.typeUserName("hhh");
		loginform.typePassword("hhh");
		loginform.clickLogin();
		opennewaccount.clcikNewAccounts();
		Loggers.logger.info("navigate to home page then sign in then click new accounts ");

	}
	public void clickOpenAccountBtn() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(open_new_account_btn, 5);
		ac.click(open_new_account_btn);
		Loggers.logger.info("click on open new account btn");
	}
}
