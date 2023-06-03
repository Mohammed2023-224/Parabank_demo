package tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Action;
import base.DriverFactory;
import base.SetupDriver;
import pageobjects.AccountOverviewPage;
import pageobjects.HomePage;
import pageobjects.LogInForm;
import pageobjects.RegisterPage;
import util.GetData;

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
		Assert.assertTrue(DriverFactory.getDriver().findElement(account_overview.welcome_message).isDisplayed());

	}

	@Test
	public void invalidLogIn_wrongCredintials() {
		HomePage homepage = new HomePage();
		LogInForm loginform = new LogInForm();
		homepage.navigateToPage();
		loginform.typeUserName("soyy never");
		loginform.typePassword("sauce exists");
		loginform.clickLogin();
		Assert.assertTrue(DriverFactory.getDriver().findElement(loginform.error_message).isDisplayed());

	}
	
	
//	@Test
//	public void invalidLogIn_NoCredintials() {
//		HomePage homepage = new HomePage();
//		LogInForm loginform = new LogInForm();
//		homepage.navigateToPage();
//		loginform.typeUserName(" ");
//		loginform.typePassword(" ");
//		loginform.clickLogin();
//		Assert.assertTrue(DriverFactory.getDriver().findElement(loginform.error_message).isDisplayed());
//
//	}
//	
//	
//	@Test
//	public void invalidLogIn_NoUserName() {
//		HomePage homepage = new HomePage();
//		LogInForm loginform = new LogInForm();
//		homepage.navigateToPage();
//		loginform.typeUserName("");
//		loginform.typePassword("sauce exists");
//		loginform.clickLogin();
//		Assert.assertTrue(DriverFactory.getDriver().findElement(loginform.error_message).isDisplayed());
//
//	}
//	
//	
//	
//	@Test
//	public void invalidLogIn_NoPassword() {
//		HomePage homepage = new HomePage();
//		LogInForm loginform = new LogInForm();
//		homepage.navigateToPage();
//		loginform.typeUserName("soyy never");
//		loginform.typePassword("");
//		loginform.clickLogin();
//		Assert.assertTrue(DriverFactory.getDriver().findElement(loginform.error_message).isDisplayed());
//	}
//		
//		
//	
//		
//		
//		
//		@DataProvider
//		public Object[][] invalidData() {
//			return new Object[][] {
//				{ "12", "34", "An internal error has occurred and has been logged." },
//				{ "12", "", "Please enter a username and password." },
//				{ "", "34", "Please enter a username and password." },
//				{ "", "", "Please enter a username and password." } };
//		}
//
//	@Test(dataProvider = "invalidData")
//	public void invalid_logins(String username,String password,String error_message) {
//		HomePage homepage = new HomePage();
//		LogInForm loginform = new LogInForm();
//		homepage.navigateToPage();
//		loginform.typeUserName(username);
//		loginform.typePassword(password);
//		loginform.clickLogin();
//		Assert.assertEquals(DriverFactory.getDriver().findElement(loginform.error_message).getText(),error_message);
//	}
	
	
	
	
	
	@DataProvider
	public Object[][] dataexcelsheet() throws InvalidFormatException, IOException{
	 GetData gd= new GetData ();
	 return  gd.read_excel_sheet1();
	}
	
	
	@Test(dataProvider = "dataexcelsheet")
	public void invalid_logins_excel(String username,String password,String error_message) {
		HomePage homepage = new HomePage();
		LogInForm loginform = new LogInForm();
		homepage.navigateToPage();
		loginform.typeUserName(username);
		loginform.typePassword(password);
		loginform.clickLogin();
		Assert.assertEquals(DriverFactory.getDriver().findElement(loginform.error_message).getText(),error_message);
	}
}
