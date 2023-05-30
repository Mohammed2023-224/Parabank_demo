package pageobjects;

import base.Loggers;
import base.SetupDriver;

public class AboutUsPage extends SetupDriver {

	


	public void navigateToPage() {
		MainButtons homepage = new MainButtons();
		driver.navigate().to(prop.getProperty("Home_page"));
		homepage.clickAboutUs();
		Loggers.logger.info("Navigate to about us page");
	}
}
