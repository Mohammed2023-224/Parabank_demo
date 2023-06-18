package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverFactory;
import base.Loggers;
import base.SetupDriver;

public class MainButtons extends SetupDriver {
	 private  Action ac = new Action(DriverFactory.getDriver());
	// logo xpath
	public By logo = (By.xpath("//img[@title=\"ParaBank\"]"));
	// home button xpath
	public By home_button = (By.xpath("//li[@class=\"home\"]"));
	// about us xpath
	public By about_us_button = (By.xpath("//li[@class=\"aboutus\"]"));
	// contact us xpath
	public By contact_button = (By.xpath("//li[@class=\"contact\"]"));


	public void clickLogo() {
		 
		ac.explicitWaitTillElementVisibility(logo, 5);
		ac.click(logo);
		Loggers.logger.info("click on logo");
	}

	public void clickhomeBtn() {
		 
		ac.explicitWaitTillElementVisibility(home_button, 5);
		ac.click(home_button);
		Loggers.logger.info("click on home button");
	}


	public void clickAboutUs() {
		 
		ac.explicitWaitTillElementVisibility(about_us_button, 5);
		ac.click(about_us_button);
		Loggers.logger.info("click on about us button");
	}


	public void clickContactUs() {
		 
		ac.explicitWaitTillElementVisibility(contact_button, 5);
		ac.click(contact_button);
		Loggers.logger.info("click on contacts link");
	}

	
}
