package pageobjects;

import base.DriverIdentify;
import base.Loggers;
import base.SetupDriver;

public class AboutUsPage extends DriverIdentify {

	


	public void navigateToPage() {
		MainButtons homepage = new MainButtons();
		driver.navigate().to(SetupDriver.prop.getProperty("Home_page"));
		homepage.clickAboutUs();
		Loggers.logger.info("Navigate to about us page");
	}
}
