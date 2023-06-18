package base;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Action {
	WebDriver driver;

	// initializing driver by constructor
	public Action(WebDriver driver) {
		this.driver = driver;
	}


	// check if element is displayed
	public boolean isDisplayed(By ele) {
		Loggers.logger.info("check existense of element");
		if (driver.findElement(ele).isDisplayed()) {

			return true;
			
		} else {

			return false;
		}


	}

	// click on web element
	public void click(By ele) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(ele));
		Loggers.logger.info("Move to the element");
		driver.findElement(ele).click();
		Loggers.logger.info("clcik on the element"+ele.toString());
	}

	// type into web element
	public void typing( By ele, String info) {
		driver.findElement(ele).clear();
		Loggers.logger.info("clear field");
		driver.findElement(ele).sendKeys(info);
		Loggers.logger.info("type in the field");
	}

	//get url
	public String getCurrentURL() {
		Loggers.logger.info("getting current url");
		return driver.getCurrentUrl();
	}

	public void backNavigate() {
		Loggers.logger.info("navigate to last page");
		driver.navigate().back();
	}

	public void explicitWaitTillElementVisibility(By ele,int time) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time))  ;
				wait.until(ExpectedConditions.visibilityOfElementLocated(ele) );
				Loggers.logger.info("wait for the visibility of the element ");
	}

}
