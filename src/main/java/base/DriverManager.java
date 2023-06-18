package base;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	private static final ThreadLocal<WebDriver> THREAD_LOCAL=new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return THREAD_LOCAL.get();
	}
	public static void setDriver(WebDriver ddr) {
		 THREAD_LOCAL.set(ddr);
	}
	public void unload() {
		THREAD_LOCAL.remove();
	}
}
