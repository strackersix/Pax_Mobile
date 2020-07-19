package br.com.pages.Mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.DriverFactoryMobile;

public class RegistrarOcorrenciaTodosPedidos extends DriverFactoryMobile {

	
	public static String ExistePedido;
	public void VerificaExistenciaPedido () {
		
		try {

			driver.getPageSource();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text = 'OCORRÊNCIA']")));
			ExistePedido = driver.findElement(By.xpath("//android.widget.Button[@text = 'OCORRÊNCIA']")).getText();
			
		} catch (Exception e) {

			ExistePedido = ""; 
			
		}
		
	}
	
	public void Ocorrencia () {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text = 'OCORRÊNCIA']")));
		driver.findElement(By.xpath("//android.widget.Button[@text = 'OCORRÊNCIA']")).click();
		
	}
	
	public void EscreverAqui ( String EscreverAqui ) {

		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//android.widget.EditText)[2]")));
		driver.findElement(By.xpath("(//android.widget.EditText)[2]")).sendKeys(EscreverAqui);
		
	}
		
	public void SelecionarStatus () {
			
		driver.findElement(By.xpath("//android.view.View[@bounds = '[849,517][879,532]']")).click();
 		
	}
	
	public void Extravio () {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadioButton[@text = 'extravio']")));
		driver.findElement(By.xpath("//android.widget.RadioButton[@text = 'extravio']")).click();
				
	}
	
	public void Ok () {
		
		driver.findElement(By.xpath("//android.widget.Button[@text = 'OK']")).click();
		
	}
	
	public void Registrar () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text = 'REGISTRAR']")));
		driver.findElement(By.xpath("//android.widget.Button[@text = 'REGISTRAR']")).click();
		Thread.sleep(1000);
		
	}
	
	public String ExistePedidos () {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@text = 'Não há pedidos para exibir.']")));
		return driver.findElement(By.xpath("//android.view.View[@text = 'Não há pedidos para exibir.']")).getText();		
		
	}
	
	

	
	
}
