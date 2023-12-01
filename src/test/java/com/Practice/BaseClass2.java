package com.Practice;

import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass2 {

	RemoteWebDriver driver;

	@Test
	public void GridExec() throws Throwable {
		URL url = new URL(" http://192.168.118.46:4444/wd/hub");
		String BROWSER="firefox";
		DesiredCapabilities cap = new DesiredCapabilities();
		if (BROWSER.equalsIgnoreCase("chrome")) {
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		} else if (BROWSER.equalsIgnoreCase("firefox")) {
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		 driver=new RemoteWebDriver(url,cap);
		driver.get("https://www.amazon.in");
	}
}
