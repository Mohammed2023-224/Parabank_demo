package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Action;
import base.SetupDriver;
import pageobjects.AccountOverviewPage;
import pageobjects.HomePage;
import pageobjects.LogInForm;
import pageobjects.RegisterPage;

public class LogInTestCases extends SetupDriver {

	@Test
	public void validLogIn() {
		RegisterPage registerpage = new RegisterPage();
		HomePage homepage = new HomePage();
		LogInForm loginform = new LogInForm();
		AccountOverviewPage account_overview = new AccountOverviewPage();
		Action ac = new Action(driver);
		registerpage.navigateToPage();
		registerpage.typeFormFirstName("sa");
		registerpage.typeFormLastName("ra");
		registerpage.typeFormCity("egypt");
		registerpage.typeFormState("alex");
		registerpage.typeFormAddress("gamal");
		registerpage.typeZipCode("123");
		registerpage.typeSSN("21321");
		registerpage.typePhone("123");
		registerpage.typeFormPassword("hhh");
		registerpage.typeFormRepeatPassworf("hhh");
		registerpage.typeFormUserName("hhh");
		registerpage.clickFormSubmitBtn();

		homepage.navigateToPage();
		ac.explicitWaitTillElementVisibility(loginform.user_name_field, 10);
		loginform.typeUserName("hhh");
		loginform.typePassword("hhh");
		loginform.clickLogin();
		Assert.assertTrue(driver.findElement(account_overview.welcome_message).isDisplayed());

	}

	@Test
	public void invalidLogIn() {
		HomePage homepage = new HomePage();
		LogInForm loginform = new LogInForm();
		homepage.navigateToPage();
		loginform.typeUserName("soyy never");
		loginform.typePassword("sauce exists");
		loginform.clickLogin();
		Assert.assertTrue(driver.findElement(loginform.error_message).isDisplayed());

	}
}
