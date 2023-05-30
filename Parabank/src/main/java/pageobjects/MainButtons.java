package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import base.Action;
import base.Loggers;
import base.SetupDriver;

public class MainButtons extends SetupDriver {

	// logo xpath
	public By logo = (By.xpath("//img[@title=\"ParaBank\"]"));
	// home button xpath
	public By home_button = (By.xpath("//li[@class=\"home\"]"));
	// about us xpath
	public By about_us_button = (By.xpath("//li[@class=\"aboutus\"]"));
	// contact us xpath
	public By contact_button = (By.xpath("//li[@class=\"contact\"]"));



	// initialize all elements
	public MainButtons() {
		PageFactory.initElements(driver, this);
	}



	public void clickLogo() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(logo, 5);
		ac.click(logo);
		Loggers.logger.info("click on logo");
	}

	public void clickhomeBtn() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(home_button, 5);
		ac.click(home_button);
		Loggers.logger.info("click on home button");
	}


	public void clickAboutUs() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(about_us_button, 5);
		ac.click(about_us_button);
		Loggers.logger.info("click on about us button");
	}


	public void clickContactUs() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(contact_button, 5);
		ac.click(contact_button);
		Loggers.logger.info("click on contacts link");
	}

	
}
