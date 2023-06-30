package pageobjects;

import org.openqa.selenium.By;

import base.DriverFactory;
import base.SetupDriver;

public class AboutUsPage extends SetupDriver {

	public By Message=(By.id("rightPanel"));


	public void navigateToPage() {
		MainButtons homepage = new MainButtons();
		DriverFactory.getDriver().navigate().to(SetupDriver.prop.getProperty("Home_page"));
		homepage.clickAboutUs();	}
}
