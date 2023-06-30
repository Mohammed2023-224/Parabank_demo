package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Action;
import base.DriverFactory;
import base.SetupDriver;
import io.qameta.allure.Description;
import pageobjects.OpenNewAccountPage;

public class NewAccountTests extends SetupDriver {
	@Description("verifying opening new check accounts functionality")
	@Test
	public void openCheckingAccounts()   {
		Action ac = new Action(DriverFactory.getDriver());
		OpenNewAccountPage opennewacoount = new OpenNewAccountPage();
		opennewacoount.navigateToPage();

		Select selecttype = new Select(DriverFactory.getDriver().findElement(opennewacoount.accout_type_selection));
		selecttype.selectByIndex(0);

		Select selecttype2 = new Select(DriverFactory.getDriver().findElement(opennewacoount.accout_number_selection));
		selecttype2.selectByIndex(0);

		opennewacoount.clickOpenAccountBtn();

		ac.explicitWaitTillElementVisibility(opennewacoount.acoount_id_verification, 6);

		Assert.assertTrue(DriverFactory.getDriver().findElement(opennewacoount.acoount_id_verification).isDisplayed());
	}
	@Description("verifying opening saving accounts functionality")
	@Test
	public void openSavingAccounts() {
		Action ac = new Action(DriverFactory.getDriver());
		OpenNewAccountPage opennewacoount = new OpenNewAccountPage();
		opennewacoount.navigateToPage();
		Select selecttype = new Select(DriverFactory.getDriver().findElement(opennewacoount.accout_type_selection));
		selecttype.selectByIndex(1);
		opennewacoount.clickOpenAccountBtn();
		ac.explicitWaitTillElementVisibility(opennewacoount.acoount_id_verification, 10);
		Assert.assertTrue(DriverFactory.getDriver().findElement(opennewacoount.acoount_id_verification).isDisplayed());
	}

}
