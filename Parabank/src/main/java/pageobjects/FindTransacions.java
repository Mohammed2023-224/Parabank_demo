package pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.Action;
import base.Loggers;
import base.SetupDriver;

public class FindTransacions extends SetupDriver{
	
	public By find_by_id_field=(By.xpath("//input[@id='criteria.transactionId']"));
	
	public By find_by_date_field=(By.xpath("//input[@id='criteria.onDate']"));
	
	public By find_by_date_range_from_field=(By.xpath("//input[@id='criteria.fromDate']"));
	
	public By find_by_date_range_to_field=(By.xpath("//input[@id='criteria.toDate']"));
	
	public By find_by_amount_field=(By.xpath("//input[@id='criteria.amount']"));
	
	
	public By select_account_selection=(By.xpath("//select[@id='accountId']"));
	
	public By find_by_id_btn=(By.xpath("//b[text()='Find by Transaction ID']//following::button[1]"));
	
	public By find_by_date_btn=(By.xpath("//b[text()='Find by Transaction ID']//following::button[2]"));
	
	public By find_by_date_range_btn=(By.xpath("//b[text()='Find by Transaction ID']//following::button[3]"));
	
	public By find_by_amount_btn=(By.xpath("//b[text()='Find by Transaction ID']//following::button[4]"));

	// initialize all elements
	public FindTransacions() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickFindByID() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(find_by_id_btn, 5);
		ac.click(find_by_id_btn);
		Loggers.logger.info("click on home link from footer panel");
	}
	public void clickFindByDate() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(find_by_date_btn, 5);
		ac.click(find_by_date_btn);
		Loggers.logger.info("click on find_by_date_btn");
	}
	public void clickFindByDateRange() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(find_by_date_range_btn, 5);
		ac.click(find_by_date_range_btn);
		Loggers.logger.info("click on find_by_date_range_btn");
	}
	public void clickFindByAmount() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(find_by_amount_btn, 5);
		ac.click(find_by_amount_btn);
		Loggers.logger.info("click on find_by_amount_btn");
	}
	
	public void typeTransactionID(String id) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(find_by_id_field, 5);
		ac.typing(find_by_id_field, id);
		Loggers.logger.info("type transaction id");
	}
	
	public void typeDate(String date) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(find_by_date_field, 5);
		ac.typing(find_by_date_field, date);
		Loggers.logger.info("type date in the date field");
	}
	
	
	public void typefromdaterange(String date) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(find_by_date_range_from_field, 5);
		ac.typing(find_by_date_range_from_field, date);
		Loggers.logger.info("type user name");
	}
	
	public void typeToDateRange(String date) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(find_by_date_range_to_field, 5);
		ac.typing(find_by_date_range_to_field, date);
		Loggers.logger.info("type user name");
	}
	
	
	public void typeAmount(String amount) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(find_by_amount_field, 5);
		ac.typing(find_by_amount_field, amount);
		Loggers.logger.info("type user name");
	}
	
	public void navigateToPage() {
		HomePage homepage = new HomePage();
		LogInForm loginform=new LogInForm();
		AccountServiceLinks servicelinks=new AccountServiceLinks();
		homepage.navigateToPage();
		loginform.typeUserName("hhh");
		loginform.typePassword("hhh");
		loginform.clickLogin();
		servicelinks.clcikFindTransActions();
		Loggers.logger.info("navigate to home page then sign in then click find transcation link");

	}
}
