package br.com.pages.Mobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.DriverFactoryMobile;
import io.appium.java_client.MobileElement;


public class ConsultarPedidoCadastradoWeb extends DriverFactoryMobile {

	public void Atualizar () {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@text = 'refresh Atualizar']")));
		driver.findElement(By.xpath("//android.view.View[@text = 'refresh Atualizar']")).click();
		
	}
	
	public void NumeroPedido ( String numeroPedido ) {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText")));
		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,409][897,523]']")).sendKeys(numeroPedido);
				
	}
	
	public void Pesquisar () {
		
		driver.findElement(By.xpath("//android.widget.Button[@text = 'search']")).click();
		
	}
	
	public String ValidaCadastroPedidoNotaFiscal () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View")));
		return driver.findElement(By.xpath("//android.view.View[@bounds = '[78,709][1002,760]']")).getText();
								
	}
		
	public String ValidaNotaFiscalPedido () {
		
		return driver.findElement(By.xpath("//android.view.View[@bounds = '[78,772][1002,817]']")).getText();
		
	}
	
	public String EnderecoEntrega () {
		
		return driver.findElement(By.xpath("//android.widget.TextView[@bounds = '[78,925][477,967]']")).getText();
		
	}
	
	public String Rua () {
		
		return driver.findElement(By.xpath("//android.view.View[@bounds = '[78,973][1002,1027]']")).getText();
		
	}
	
	public String Bairro () {
		
		return driver.findElement(By.xpath("//android.view.View[@bounds = '[78,1030][1002,1087]']")).getText();
		
	}
	
	public String Cidade () {
		
		return driver.findElement(By.xpath("//android.view.View[@bounds = '[78,1090][1002,1144]']")).getText();
		
	}
	
	public String Estado () {
		
		return driver.findElement(By.xpath("//android.view.View[@bounds = '[78,1150][1002,1204]']")).getText();
		
	}
	
	public String CEP () {
		
		return driver.findElement(By.xpath("//android.view.View[@bounds = '[78,1207][1002,1264]']")).getText();
		
	}

	public void LimparNumeroPedido () {
		
		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[24,409][897,523]']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text = 'reset']")).click();
				
	}

}
		
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

