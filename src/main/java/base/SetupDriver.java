package base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {
	public static WebDriver driver;
	public static Properties prop;
	public static FileReader fr;
    @Parameters ("browsername")
	@BeforeMethod
	public void setup(String browsername) throws IOException {
		prop = new Properties();

		FileReader fr = new FileReader(
				System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
						+ "resources" + File.separator + "configurations" + File.separator + "config.properties");
//		prop.getProperty("browser")
		prop.load(fr);
		if (browsername.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--user-data-dir=C:/ChromeProfile/Profile1");

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);
			DriverFactory.setDriver(driver);
			Loggers.logger.info("chrome driver setup");
		} else if (browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			DriverFactory.setDriver(driver);
			Loggers.logger.info("fire fox driver setup");

		} else if (browsername.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();

			options.addArguments("--remote-allow-origins=*");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(options);
			DriverFactory.setDriver(driver);
			Loggers.logger.info("edge driver setup");
		}	
	}
	@AfterMethod
	public void tear_down() {

		DriverFactory.getDriver().close();
		DriverFactory.unload();

//		driver.close();
		Loggers.logger.info("end session");
	}

}
