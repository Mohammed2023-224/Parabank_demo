package pageobjects;

import org.openqa.selenium.By;

import base.Loggers;
import base.SetupDriver;

public class AccountOverviewPage extends SetupDriver {


	public By welcome_message=(By.xpath("//div[@id='leftPanel']"));
	public void navigateToPage() {
		HomePage homepage = new HomePage();
		LogInForm loginform=new LogInForm();
		AccountServiceLinks servicelinks=new AccountServiceLinks();
		homepage.navigateToPage();
		Loggers.logger.info("navigate to home page");
		loginform.typeUserName("hhh");
		loginform.typePassword("hhh");
		loginform.clickLogin();
		Loggers.logger.info("sign in ");
		servicelinks.clcikOverView();
	}
}
