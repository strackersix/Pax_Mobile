package br.com.pages.Mobile;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import br.com.core.DriverFactoryMobile;

public class LogoutMobile extends DriverFactoryMobile {
	
	public void Sair() {
		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.Button[@text = 'SAIR']")).click();
		
	}

}
