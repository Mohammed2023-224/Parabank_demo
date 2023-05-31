package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.FakeData;
import base.SetupDriver;
import pageobjects.RegisterPage;

public class RegisterTestCases extends SetupDriver{
	FakeData fakers=new FakeData();
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
		Assert.assertTrue(driver.findElement(registerpage.account_created_message).isDisplayed());
	}
	

}
