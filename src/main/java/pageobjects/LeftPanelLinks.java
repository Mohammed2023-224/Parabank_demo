package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverFactory;
import base.Loggers;
import base.SetupDriver;

public class LeftPanelLinks extends SetupDriver {
	
	 private Action ac = new Action(DriverFactory.getDriver());
	// left menu about us link xpath
	public By about_us_link = (By.xpath("//ul[@class='leftmenu']//child::a[text()='About Us']"));
	// left menu services link xpath
	public By services_link = (By.xpath("//ul[@class='leftmenu']//child::a[text()='Services']"));
	// left menu products link xpath
	public By products_link = (By.xpath("//ul[@class='leftmenu']//child::a[text()='Products']"));
	// left menu locations link xpath
	public By locations_link = (By.xpath("//ul[@class='leftmenu']//child::a[text()='Locations']"));
	// left menu admin page link xpath
	public By admin_page_link = (By.xpath("//ul[@class='leftmenu']//child::a[text()='Admin Page']"));

	public void clickServices() {
		 
		ac.explicitWaitTillElementVisibility(services_link, 5);
		ac.click(services_link);
		Loggers.logger.info("click on services link");
	}

	public void clickAboutUsLink() {
		 
		ac.explicitWaitTillElementVisibility(about_us_link, 5);
		ac.click(about_us_link);
		Loggers.logger.info("click on about us link");
	}

	public void clickAdminPage() {
		 
		ac.explicitWaitTillElementVisibility(admin_page_link, 5);
		ac.click(admin_page_link);
		Loggers.logger.info("click on admin page link");
	}

	public void clcikProducts() {
		 
		ac.explicitWaitTillElementVisibility(products_link, 5);
		ac.click(products_link);
		Loggers.logger.info("click on products link");
	}

	public void clickLocations() {
		 
		ac.explicitWaitTillElementVisibility(locations_link, 5);
		ac.click(locations_link);
		Loggers.logger.info("click on locations link");
	}

}
