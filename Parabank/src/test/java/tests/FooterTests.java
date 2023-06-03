package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.DriverFactory;
import base.SetupDriver;
import pageobjects.AboutUsPage;
import pageobjects.ContactUsPage;
import pageobjects.FooterLinks;
import pageobjects.HomePage;

public class FooterTests extends SetupDriver {
	@Test
	public void testHomeFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		homepage.navigateToPage();
		footerlinks.clickHomeFooterLink();
		Assert.assertTrue(DriverFactory.getDriver().findElement(homepage.services_read_more_btn).isDisplayed());
	}
	@Test
	public void testAboutUsFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		AboutUsPage aboutus=new AboutUsPage();
		homepage.navigateToPage();
		footerlinks.clickHomeFooterLink();
		Assert.assertTrue(DriverFactory.getDriver().findElement(aboutus.Message).isDisplayed());
	}
	
	@Test
	public void testServicesFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		homepage.navigateToPage();
		footerlinks.clickHomeFooterLink();
		Assert.assertTrue(DriverFactory.getDriver().findElement(By.id("rightPanel")).isDisplayed());
	}
	
	@Test
	public void testProductsFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		homepage.navigateToPage();
		footerlinks.clcikProductsFooterLink();
		Assert.assertEquals(DriverFactory.getDriver().getCurrentUrl(),prop.getProperty("Products_page"));
	}
	
	@Test
	public void testLocationFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		homepage.navigateToPage();
		footerlinks.clickLocationsFooterLink();
		Assert.assertEquals(DriverFactory.getDriver().getCurrentUrl(),prop.getProperty("Locations_page"));
	}
	@Test
	public void testSiteMapFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		homepage.navigateToPage();
		footerlinks.clickSiteMap();
		Assert.assertTrue(DriverFactory.getDriver().findElement(By.className("Solutions")).isDisplayed());
	}
	
	@Test
	public void testForumFooterLinks() {
		HomePage homepage=new HomePage();
		FooterLinks footerlinks=new FooterLinks();
		homepage.navigateToPage();
		footerlinks.clickForum();
		Assert.assertEquals(DriverFactory.getDriver().getCurrentUrl(),"https://forums.parasoft.com/");
	}
	
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
