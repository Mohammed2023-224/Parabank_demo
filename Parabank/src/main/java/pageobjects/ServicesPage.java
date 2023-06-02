package pageobjects;

import base.DriverIdentify;
import base.Loggers;
import base.SetupDriver;

public class ServicesPage extends DriverIdentify {

	public void navigateToPage() {
		HomePage homepage = new HomePage();
		driver.navigate().to(SetupDriver.prop.getProperty("Home_page"));
		homepage.clickServicesReadMoreBtn();
		Loggers.logger.info("Navigate to services page");
	}
}
