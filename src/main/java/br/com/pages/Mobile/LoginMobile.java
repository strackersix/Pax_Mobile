package br.com.pages.Mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.DriverFactoryMobile;

public class LoginMobile extends DriverFactoryMobile {
	
	
	public void Usuario ( String usuario ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText")));
		driver.findElement(By.xpath("//android.widget.EditText")).sendKeys(usuario);
		
	}
	
	public void Senha ( String senha ) {
		
		driver.findElement(By.xpath("//android.widget.EditText[@text = 'Senha']")).sendKeys(senha);
				
	}
	
	public void btnLogin () {
		
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text = 'LOGIN']")));
		driver.findElement(By.xpath("//android.widget.Button[@text = 'LOGIN']")).click();
		
	}
	
	public void PermitirLocalizacao () {
		
		try {
					
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text = 'PERMITIR']")));
			driver.findElement(By.xpath("//android.widget.Button[@text = 'PERMITIR']")).click();
			
		} catch (Exception e) {
		
		}
				
	}
	
	public String MeusPedidos () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.View[@text = 'Meus pedidos']")));
		return driver.findElement(By.xpath("//android.view.View[@text = 'Meus pedidos']")).getText();
		
	}
		

}
