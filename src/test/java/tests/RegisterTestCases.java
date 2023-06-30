package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverFactory;
import base.FakeData;
import base.SetupDriver;
import io.qameta.allure.Description;
import pageobjects.RegisterPage;

public class RegisterTestCases extends SetupDriver{
	FakeData fakers=new FakeData();
	@Description("verifying successful register")
	@Test
	public void successfulRegister() {
		RegisterPage registerpage=new RegisterPage();
		registerpage.navigateToPage();
		registerpage.typeFormFirstName("sa");
		registerpage.typeFormLastName("ra");
		registerpage.typeFormCity("egypt");
		registerpage.typeFormState("alex");
		registerpage.typeFormAddress("gamal");
		registerpage.typeZipCode("123");
		registerpage.typeSSN("21321");
		registerpage.typePhone("123");
		registerpage.typeFormPassword(fakers.fake_password);
		registerpage.typeFormRepeatPassworf(fakers.fake_password);
		registerpage.typeFormUserName(fakers.username);
		registerpage.clickFormSubmitBtn();
		Assert.assertTrue(DriverFactory.getDriver().findElement(registerpage.account_created_message).isDisplayed());
	}
	
	@Description("verifying unsuccessful register different password ")
	@Test
	public void unsuccessfulRegister_differentPassword() {
		RegisterPage registerpage=new RegisterPage();
		registerpage.navigateToPage();
		registerpage.typeFormFirstName("sa");
		registerpage.typeFormLastName("ra");
		registerpage.typeFormCity("egypt");
		registerpage.typeFormState("alex");
		registerpage.typeFormAddress("gamal");
		registerpage.typeZipCode("123");
		registerpage.typeSSN("21321");
		registerpage.typePhone("123");
		registerpage.typeFormPassword(fakers.fake_password);
		registerpage.typeFormRepeatPassworf(fakers.username);
		registerpage.typeFormUserName(fakers.username);
		registerpage.clickFormSubmitBtn();
		Assert.assertTrue(DriverFactory.getDriver().findElement(registerpage.missmatchpasswordmesssage).isDisplayed());
	}
	
	@Description("verifying unsuccessful register no user name")
	@Test
	public void unsuccessfulRegister_NoUserNmae() {
		RegisterPage registerpage=new RegisterPage();
		registerpage.navigateToPage();
		registerpage.typeFormFirstName("sa");
		registerpage.typeFormLastName("ra");
		registerpage.typeFormCity("egypt");
		registerpage.typeFormState("alex");
		registerpage.typeFormAddress("gamal");
		registerpage.typeZipCode("123");
		registerpage.typeSSN("21321");
		registerpage.typePhone("123");
		registerpage.typeFormPassword(fakers.fake_password);
		registerpage.typeFormRepeatPassworf(fakers.username);
		registerpage.typeFormUserName("");
		registerpage.clickFormSubmitBtn();
		Assert.assertTrue(DriverFactory.getDriver().findElement(registerpage.error_message).isDisplayed());
	}
	
	
	@Description("verifying unsuccessful register no password")
	@Test
	public void unsuccessfulRegister_NoPassword() {
		RegisterPage registerpage=new RegisterPage();
		registerpage.navigateToPage();
		registerpage.typeFormFirstName("sa");
		registerpage.typeFormLastName("ra");
		registerpage.typeFormCity("egypt");
		registerpage.typeFormState("alex");
		registerpage.typeFormAddress("gamal");
		registerpage.typeZipCode("123");
		registerpage.typeSSN("21321");
		registerpage.typePhone("123");
		registerpage.typeFormPassword("");
		registerpage.typeFormRepeatPassworf("");
		registerpage.typeFormUserName(fakers.username);
		registerpage.clickFormSubmitBtn();
		Assert.assertTrue(DriverFactory.getDriver().findElement(registerpage.required_password_message).isDisplayed());
	}
}
