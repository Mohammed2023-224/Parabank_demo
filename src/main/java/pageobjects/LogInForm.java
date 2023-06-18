package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverFactory;
import base.Loggers;
import base.SetupDriver;

public class LogInForm extends SetupDriver{
	 private  Action ac = new Action(DriverFactory.getDriver());
	// username xpath
	public By user_name_field = (By.xpath("//div[@class='login']//child::input[@name='username']"));
	// password field xpath
	public By password_field = (By.xpath("//div[@class='login']//child::input[@name='password']"));
	// login btn xpath
	public By log_in_btn = (By.xpath("//div[@class='login']//child::input[@class='button']"));
	// forgeet login link xpath
	public By forget_login_link = (By.xpath("//a[text()='Forgot login info?']"));

	// register link xpath
	public By register_link = (By.xpath("//a[text()='Register']"));
	//error message
	public By error_message=(By.xpath("//p[@class='error']"));

	
	public void typeUserName(String username) {
 

		ac.explicitWaitTillElementVisibility(user_name_field, 15);
		ac.typing(user_name_field, username);
		Loggers.logger.info("type user name");
	}

	public void typePassword(String pass) {
 
		ac.explicitWaitTillElementVisibility(password_field, 15);
		ac.typing(password_field, pass);
		Loggers.logger.info("type password");
	}

	public void clickLogin() {
 
		ac.explicitWaitTillElementVisibility(log_in_btn, 15);
		ac.click(log_in_btn);
		Loggers.logger.info("click on login btn");
	}

	public void clickRegister() {
 
		ac.explicitWaitTillElementVisibility(register_link, 15);
		ac.click(register_link);
		Loggers.logger.info("click on register link");
	}

	public void clickForgetLoginInfo() {
 
		ac.explicitWaitTillElementVisibility(forget_login_link, 15);
		ac.click(forget_login_link);
		Loggers.logger.info("click on forget login info link");
	}
	
	public  String errorTextExtract() {
		 return DriverFactory.getDriver().findElement(error_message).getText();
	}
}
