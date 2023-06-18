package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverFactory;
import base.Loggers;
import base.SetupDriver;

public class FooterLinks extends SetupDriver {
	 private  Action ac = new Action(DriverFactory.getDriver());
	// home footer link xpath
	public By home_footer_link = (By.xpath("//div[@id=\"footerPanel\"]//a[text()='Home']"));
	// about us footer link xpath
	public By about_us_link = (By.xpath("//div[@id=\"footerPanel\"]//a[text()='About Us']"));
	// services footer link xpath
	public By services_footer_link = (By
			.xpath("//div[@id='footerPanel']//a[text()='Services']"));
	// products footer link xpath
	public By products_footer_link = (By.xpath(
			"//div[@id='footerPanel']//a[text()='Products']"));
	// locations footer link xpath
	public By locations_footer_link = (By.xpath(
			"//div[@id='footerPanel']//a[text()='Locations']"));
	// forums footer link xpath
	public By forum_footer_link = (By.xpath(
			"//div[@id='footerPanel']//a[text()='Forum']"));
	// site map footer link xpath
	public By site_map_footer_link = (By.xpath(
			"//div[@id='footerPanel']//a[text()='Site Map']"));
	// contacts footer link xpath
	public By contacts_footer_link = (By.xpath("//div[@id='footerPanel']//a[text()='Contact Us']"));

	public void clickHomeFooterLink() {
		 
		ac.explicitWaitTillElementVisibility(home_footer_link, 5);
		ac.click(home_footer_link);
		Loggers.logger.info("click on home link from footer panel");
	}

	public void clickServicesFooterLink() {
		 
		ac.explicitWaitTillElementVisibility(services_footer_link, 5);
		ac.click(services_footer_link);
		Loggers.logger.info("click on services link from footer panel");
	}

	public void clickLocationsFooterLink() {
		 
		ac.explicitWaitTillElementVisibility(locations_footer_link, 5);
		ac.click(locations_footer_link);
		Loggers.logger.info("click on locations link from foter panel");
	}

	public void clickForum() {
		 
		ac.explicitWaitTillElementVisibility(forum_footer_link, 5);
		ac.click(forum_footer_link);
		Loggers.logger.info("click on forum link");
	}

	public void clickSiteMap() {
		 
		ac.explicitWaitTillElementVisibility(site_map_footer_link, 5);
		ac.click(site_map_footer_link);
		Loggers.logger.info("click on site map link");
	}

	public void clcikProductsFooterLink() {
		 
		ac.explicitWaitTillElementVisibility(products_footer_link, 5);
		ac.click(products_footer_link);
		Loggers.logger.info("click on products link from footer panel");
	}

	public void clickContackFooterLink() {
		 
		ac.explicitWaitTillElementVisibility(contacts_footer_link, 5);
		ac.click(contacts_footer_link);
		Loggers.logger.info("click on contacts link from foter panel");
	}
}
