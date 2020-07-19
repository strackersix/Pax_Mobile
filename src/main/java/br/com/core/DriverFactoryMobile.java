package br.com.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverFactoryMobile {

	public static AndroidDriver<MobileElement> driver = CreateDriver();

	public static void SetupDriver() {

		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "UBV7N18321003225");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability(Parametros.appPackage, Parametros.appPackageValue);
		desiredCapabilities.setCapability(Parametros.appActivity, Parametros.appActivityValue);
		desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\gabriel.souza\\eclipse-workspace\\Pax_Mobile\\src\\main\\resources\\18040444_com.pax.way_20200617140612_qa.apk");

		try {

			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);

		} catch (MalformedURLException e) {

			e.printStackTrace();

		}

	}
	
	public static AndroidDriver<MobileElement> CreateDriver() {

		if (driver == null) {

			CreateDriver();

		}

		return driver;

	}

	public static void FinalizarDriverFactory() {

		if (driver != null) {

			driver.quit();
			driver = null;

		}

	}

}
