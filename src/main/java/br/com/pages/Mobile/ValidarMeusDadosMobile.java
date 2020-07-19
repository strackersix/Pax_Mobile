package br.com.pages.Mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.DriverFactoryMobile;

public class ValidarMeusDadosMobile extends DriverFactoryMobile {

	
	public void MeusDados () {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@text = 'person Meus dados']")));
		driver.findElement(By.xpath("//android.view.View[@text = 'person Meus dados']")).click();
		
	}
	
	public String ValidaNome () {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView")));
		return driver.findElement(By.xpath("//android.widget.TextView[1]")).getText();	
				
	}
	
	public String ValidaContato () {
		
		return driver.findElement(By.xpath("//android.widget.TextView[2]")).getText();
		
	}

	public String ValidaEmail () {
		
		return driver.findElement(By.xpath("//android.widget.TextView[3]")).getText();
		
	}
	
	public String ValidaPlaca () {
		
		return driver.findElement(By.xpath("//android.widget.TextView[4]")).getText();
		
	}
	
	public String ValidaTransportadora () {
		
		return driver.findElement(By.xpath("//android.widget.TextView[5]")).getText();
		
	}
	
	
	
}
