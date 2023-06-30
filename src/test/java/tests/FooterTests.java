package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverFactory;
import base.SetupDriver;
import io.qameta.allure.Description;
import pageobjects.AboutUsPage;
import pageobjects.ContactUsPage;
import pageobjects.FooterLinks;
import pageobjects.HomePage;

public class FooterTests extends SetupDriver {
	@Description("verifying functionaliity of footer home page link")
	@Test
	public void testHomeFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		homepage.navigateToPage();
		footerlinks.clickHomeFooterLink();
		Assert.assertTrue(DriverFactory.getDriver().findElement(homepage.services_read_more_btn).isDisplayed());
	}
	@Description("verifying functionaliity of footer about us link")
	@Test
	public void testAboutUsFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		AboutUsPage aboutus=new AboutUsPage();
		homepage.navigateToPage();
		footerlinks.clickHomeFooterLink();
		Assert.assertTrue(DriverFactory.getDriver().findElement(aboutus.Message).isDisplayed());
	}
	@Description("verifying functionaliity of footer services link")
	@Test
	public void testServicesFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		homepage.navigateToPage();
		footerlinks.clickHomeFooterLink();
		Assert.assertTrue(DriverFactory.getDriver().findElement(By.id("rightPanel")).isDisplayed());
	}
	@Description("verifying functionaliity of footer products link")
	@Test
	public void testProductsFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		homepage.navigateToPage();
		footerlinks.clcikProductsFooterLink();
		Assert.assertEquals(DriverFactory.getDriver().getCurrentUrl(),prop.getProperty("Products_page"));
	}
	@Description("verifying functionaliity of footer Location link")
	@Test
	public void testLocationFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		homepage.navigateToPage();
		footerlinks.clickLocationsFooterLink();
		Assert.assertEquals(DriverFactory.getDriver().getCurrentUrl(),prop.getProperty("Locations_page"));
	}
	@Description("verifying functionaliity of footer site map link")
	@Test
	public void testSiteMapFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		homepage.navigateToPage();
		footerlinks.clickSiteMap();
		Assert.assertTrue(DriverFactory.getDriver().findElement(By.className("Solutions")).isDisplayed());
	}
	@Description("verifying functionaliity of footer forum link")
	@Test
	public void testForumFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		homepage.navigateToPage();
		footerlinks.clickForum();
		Assert.assertEquals(DriverFactory.getDriver().getCurrentUrl(),"https://forums.parasoft.com/");
	}
	@Description("verifying functionaliity of footer contact us link")
	@Test
	public void testContactUsFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		ContactUsPage contacy=new ContactUsPage();
		homepage.navigateToPage();
		footerlinks.clickContackFooterLink();
		Assert.assertTrue(DriverFactory.getDriver().findElement(contacy.care_from_message).isDisplayed());
	}
}
