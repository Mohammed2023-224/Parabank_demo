package tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Action;
import base.DriverFactory;
import base.SetupDriver;
import io.qameta.allure.Description;
import pageobjects.AccountOverviewPage;
import pageobjects.HomePage;
import pageobjects.LogInForm;
import pageobjects.RegisterPage;
import util.GetData;
import util.GetJsonFileInvalidData;

public class LogInTestCases extends SetupDriver {
	@Description("verifying valid login")
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
		ac.explicitWaitTillElementVisibility(loginform.user_name_field, 20);
		loginform.typeUserName("hhh");
		loginform.typePassword("hhh");
		loginform.clickLogin();
		Assert.assertTrue(DriverFactory.getDriver().findElement(account_overview.welcome_message).isDisplayed());

	}
	@Description("verifying invalid login wrong credintials")
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
	
	@Description("verifying invalid login no credintials")
	@Test
	public void invalidLogIn_NoCredintials() {
		HomePage homepage = new HomePage();
		LogInForm loginform = new LogInForm();
		homepage.navigateToPage();
		loginform.typeUserName(" ");
		loginform.typePassword(" ");
		loginform.clickLogin();
		Assert.assertTrue(DriverFactory.getDriver().findElement(loginform.error_message).isDisplayed());

	}
	
	@Description("verifying invalid login no user name")
	@Test
	public void invalidLogIn_NoUserName() {
		HomePage homepage = new HomePage();
		LogInForm loginform = new LogInForm();
		homepage.navigateToPage();
		loginform.typeUserName("");
		loginform.typePassword("sauce exists");
		loginform.clickLogin();
		Assert.assertTrue(DriverFactory.getDriver().findElement(loginform.error_message).isDisplayed());

	}
	
	
	@Description("verifying invalid login no password")
	@Test
	public void invalidLogIn_NoPassword() {
		HomePage homepage = new HomePage();
		LogInForm loginform = new LogInForm();
		homepage.navigateToPage();
		loginform.typeUserName("soyy never");
		loginform.typePassword("");
		loginform.clickLogin();
		Assert.assertTrue(DriverFactory.getDriver().findElement(loginform.error_message).isDisplayed());
	}
		
		
	
		
		
		
		@DataProvider
		public Object[][] invalidData() {
			return new Object[][] {
				{ "12", "34", "An internal error has occurred and has been logged." },
				{ "12", "", "Please enter a username and password." },
				{ "", "34", "Please enter a username and password." },
				{ "", "", "Please enter a username and password." } };
		}
	@Description("verifying invalid login date provider edition")
	@Test(dataProvider = "invalidData")
	public void invalid_logins(String username,String password,String error_message) {
		HomePage homepage = new HomePage();
		LogInForm loginform = new LogInForm();
		homepage.navigateToPage();
		loginform.typeUserName(username);
		loginform.typePassword(password);
		loginform.clickLogin();
		Assert.assertEquals(DriverFactory.getDriver().findElement(loginform.error_message).getText(),error_message);
	}
	
	
	@DataProvider
	public Object[][] getInvalidLoginsData() throws  IOException, InvalidFormatException {
		 GetData gd= new GetData ();
	    Object[][] data = gd.read_excel_sheet1(); // assuming you have defined the read_excel_sheet1 method
	    
	    return data;
	}
	@Description("verifying invalid login excel edition")
	@Test(dataProvider = "getInvalidLoginsData")
	public void invalid_logins_excel(String username, String password, String message) {

		HomePage homepage = new HomePage();
		LogInForm loginform = new LogInForm();
		homepage.navigateToPage();
		loginform.typeUserName(username);
		loginform.typePassword(password);
		loginform.clickLogin();
		Assert.assertEquals(DriverFactory.getDriver().findElement(loginform.error_message).getText(),message);
	}
	
	
	
	@DataProvider
	public String[] invalid_JSON_file() throws IOException{
		GetJsonFileInvalidData data=new GetJsonFileInvalidData();
		return data.invalid_JSON_file();		
	}
	@Description("verifying valid login JSON file edition")
	@Test(dataProvider = "invalid_JSON_file")
	public void invalid_logins_excel(String data) {
			String users[]=data.split(",");
			
		HomePage homepage = new HomePage();
		LogInForm loginform = new LogInForm();
		homepage.navigateToPage();
		loginform.typeUserName(users[0].replace("\"", ""));
		loginform.typePassword(users[1].replace("\"", ""));
		loginform.clickLogin();
		Assert.assertEquals(DriverFactory.getDriver().findElement(loginform.error_message).getText(),users[2].replace("\"", ""));
	}
	
	
}
