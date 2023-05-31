package base;

import org.openqa.selenium.WebDriver;

public class DriverFactory {
	   private DriverFactory()
	   {
	   }
	   private static DriverFactory instance = new DriverFactory();
	   public static DriverFactory getInstance()
	   {
	      return instance;
	   }
	private static final ThreadLocal<WebDriver> THREAD_LOCAL=new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		Loggers.logger.debug("get the driver from ThreadLocal variable");
		return THREAD_LOCAL.get();
	}
	public static void setDriver(WebDriver ddr) {
        Loggers.logger.debug("save the driver to ThreadLocal variable");
		 THREAD_LOCAL.set(ddr);
	}
	public static void unload() {
		System.out.println(Thread.currentThread().getId());
        Loggers.logger.debug("remove the driver from ThreadLocal variable");
		THREAD_LOCAL.remove();
	}
	
}
