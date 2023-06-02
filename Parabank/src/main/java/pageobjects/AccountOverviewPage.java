package pageobjects;

import org.openqa.selenium.By;

import base.DriverIdentify;
import base.Loggers;

public class AccountOverviewPage extends DriverIdentify {


	public By welcome_message=(By.xpath("//div[@id='leftPanel']"));
	public void navigateToPage() {
		HomePage homepage = new HomePage();
		LogInForm loginform=new LogInForm();
		AccountServiceLinks servicelinks=new AccountServiceLinks();
		homepage.navigateToPage();
		loginform.typeUserName("hhh");
		loginform.typePassword("hhh");
		loginform.clickLogin();
		servicelinks.clcikOverView();
		Loggers.logger.info("navigate to home page then sign in then click account overview");

	}
}
