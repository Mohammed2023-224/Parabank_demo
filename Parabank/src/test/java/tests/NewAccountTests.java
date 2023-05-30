package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Action;
import base.SetupDriver;
import pageobjects.OpenNewAccountPage;

public class NewAccountTests extends SetupDriver {
	@Test
	public void openCheckingAccounts() throws InterruptedException {
		Action ac = new Action(driver);
		OpenNewAccountPage opennewacoount = new OpenNewAccountPage();
		opennewacoount.navigateToPage();

		Select selecttype = new Select(driver.findElement(opennewacoount.accout_type_selection));
		selecttype.selectByIndex(0);

		Select selecttype2 = new Select(driver.findElement(opennewacoount.accout_number_selection));
		selecttype2.selectByIndex(0);

		opennewacoount.clickOpenAccountBtn();

		ac.explicitWaitTillElementVisibility(opennewacoount.acoount_id_verification, 6);

		Assert.assertTrue(driver.findElement(opennewacoount.acoount_id_verification).isDisplayed());
	}

	@Test
	public void openSavingAccounts() {
		Action ac = new Action(driver);
		OpenNewAccountPage opennewacoount = new OpenNewAccountPage();
		opennewacoount.navigateToPage();
		Select selecttype = new Select(driver.findElement(opennewacoount.accout_type_selection));
		selecttype.selectByIndex(1);
		opennewacoount.clickOpenAccountBtn();
		ac.explicitWaitTillElementVisibility(opennewacoount.acoount_id_verification, 10);
		Assert.assertTrue(driver.findElement(opennewacoount.acoount_id_verification).isDisplayed());
	}

}
