package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.Action;
import base.Loggers;
import base.SetupDriver;

public class LeftPanelLinks extends SetupDriver {
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

	// initialize all elements
	public LeftPanelLinks() {
		PageFactory.initElements(driver, this);
	}

	public void clickServices() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(services_link, 5);
		ac.click(services_link);
		Loggers.logger.info("click on services link");
	}

	public void clickAboutUsLink() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(about_us_link, 5);
		ac.click(about_us_link);
		Loggers.logger.info("click on about us link");
	}

	public void clickAdminPage() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(admin_page_link, 5);
		ac.click(admin_page_link);
		Loggers.logger.info("click on admin page link");
	}

	public void clcikProducts() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(products_link, 5);
		ac.click(products_link);
		Loggers.logger.info("click on products link");
	}

	public void clickLocations() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(locations_link, 5);
		ac.click(locations_link);
		Loggers.logger.info("click on locations link");
	}

}
