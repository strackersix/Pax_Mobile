package br.com.pages.Mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.DriverFactoryMobile;
import io.appium.java_client.MobileElement;

public class RegistrarEntregueTodosPedidos extends DriverFactoryMobile {

	
	public static String ExistePedido;
	public void VerificaExistenciaPedido () {
		
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text = 'ENTREGUE']")));
			ExistePedido = driver.findElement(By.xpath("//android.widget.Button[@text = 'ENTREGUE']")).getText();
			
		} catch (Exception e) {

			ExistePedido = "";
			
		}
			
	}
		
	public void Entregue () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text = 'ENTREGUE']")));
		driver.findElement(By.xpath("//android.widget.Button[@text = 'ENTREGUE']")).click();
				
	}
	
	public void SelecionarStatus () {
			
		try {
		
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text = 'CONFIRMAR']")));
			driver.findElement(By.xpath("//android.widget.Button[@text = 'CONFIRMAR']")).click();
			driver.findElement(By.xpath("//android.view.View[@text = 'Selecione um status']")).click();
			WebDriverWait wait2 = new WebDriverWait(driver, 5);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadioButton[@text = 'entregue']")));		
			driver.findElement(By.xpath("//android.widget.RadioButton[@text = 'entregue']")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text = 'OK']")).click();

		} catch (Exception e) {

			driver.getPageSource();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text = 'CONFIRMAR']")));
			driver.findElement(By.xpath("//android.widget.Button[@text = 'CONFIRMAR']")).click();
			driver.findElement(By.xpath("//android.widget.Button[@bounds = '[96,454][1032,598]']")).click();
			WebDriverWait wait2 = new WebDriverWait(driver, 5);
			wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadioButton[@text = 'entregue']")));		
			driver.findElement(By.xpath("//android.widget.RadioButton[@text = 'entregue']")).click();
			driver.findElement(By.xpath("//android.widget.Button[@text = 'OK']")).click();
			
		}
		
	}
	
	public void NomeRecebedor ( String nomeRecebedor ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@bounds = '[141,646][939,757]']")));
		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[141,646][939,757]']")).sendKeys(nomeRecebedor);
						
	}
	
	public void DocumentoRecebedor ( String documentoRecebedor ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text = 'CONFIRMAR']")));
		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[141,847][939,958]']")).sendKeys(documentoRecebedor);
		
	}
	
	public void Confirmar () {
		
		driver.findElement(By.xpath("//android.widget.Button[@text = 'CONFIRMAR']")).click();
		
	}
		
	public String ExistePedidos () {
		
		driver.getPageSource();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@text = 'Não há pedidos para exibir.']")));
		return driver.findElement(By.xpath("//android.view.View[@text = 'Não há pedidos para exibir.']")).getText();		
		
	}
	
	
}
