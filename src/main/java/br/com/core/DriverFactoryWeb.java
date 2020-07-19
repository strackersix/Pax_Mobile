package br.com.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactoryWeb {

	public static WebDriver driver;

	private void createNewDriverInstance() {

		System.setProperty("webdriver.chrome.driver", "C:\\Automacao\\ChromeDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);

	}
	
	public void InicializaDriverFactory() {
		
		if (driver == null)
			createNewDriverInstance();
		
	}
	
	public DriverFactoryWeb() {
		
		InicializaDriverFactory ();
		
	}
	
	public static void FinalizarDriverFactory() {
		
		driver.quit();
		driver = null;

	}
		
}
