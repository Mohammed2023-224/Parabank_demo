package pageobjects;

import org.openqa.selenium.support.PageFactory;

import base.Loggers;
import base.SetupDriver;

public class ServicesPage extends SetupDriver {

	// initialize all elements
	public ServicesPage() {
		PageFactory.initElements(driver, this);
	}

	public void navigateToPage() {
		HomePage homepage = new HomePage();
		driver.navigate().to(prop.getProperty("Home_page"));
		homepage.clickServicesReadMoreBtn();
		Loggers.logger.info("Navigate to services page");
	}
}
