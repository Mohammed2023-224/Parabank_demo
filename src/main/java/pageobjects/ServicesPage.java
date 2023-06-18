package pageobjects;

import base.DriverFactory;
import base.Loggers;
import base.SetupDriver;

public class ServicesPage extends SetupDriver {

	public void navigateToPage() {
		HomePage homepage = new HomePage();
		DriverFactory.getDriver().navigate().to(SetupDriver.prop.getProperty("Home_page"));
		homepage.clickServicesReadMoreBtn();
		Loggers.logger.info("Navigate to services page");
	}
}
