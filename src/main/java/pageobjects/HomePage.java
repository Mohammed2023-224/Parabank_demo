package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverFactory;
import base.Loggers;
import base.SetupDriver;

public class HomePage extends SetupDriver {
	 private  Action ac = new Action(DriverFactory.getDriver());
	// services read more link xpath
	public By services_read_more_btn = (By.xpath("//a[@href='services.htm' and text()=\"Read More\" ]"));
	// news link xpath
	public By news_link = (By.xpath("//a[@href='news.htm' and text()=\"Read More\" ]"));

	public void clickServicesReadMoreBtn() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(services_read_more_btn, 5);
		ac.click(services_read_more_btn);
		Loggers.logger.info("click on services read more link");
	}


	
	public void clickNewsLink() {
		 
		ac.explicitWaitTillElementVisibility(news_link, 5);
		ac.click(news_link);
		Loggers.logger.info("click on news read more link");
	}

	public void navigateToPage() {
		
		DriverFactory.getDriver().navigate().to(SetupDriver.prop.getProperty("Home_page"));
		Loggers.logger.info("Navigate to homepage");
	}
}
