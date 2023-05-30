package base;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
		driver.findElement(ele).click();
	}

	// type into web element
	public void typing( By ele, String info) {
		driver.findElement(ele).clear();
		driver.findElement(ele).sendKeys(info);
	}
	//implicit wait
	@SuppressWarnings("deprecation")
	public void implicitWait(int timeout) {
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	//get url
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}

	public void backNavigate() {
		driver.navigate().back();
	}

	public void explicitWaitTillElementVisibility(By ele,int time) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time))  ;
				wait.until(ExpectedConditions.visibilityOfElementLocated(ele) );
	}

}
