package br.com.pages.Web;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.utils.Random;

public class CadastrarRotas extends BasePage {
	
	private static String TituloRota = "Rota: " + Random.randomNumeric(5);
	public void CenarioCadastrarRotas () throws InterruptedException {
		
		Url(Parametros.UrlPax);
		Rotas();
		CadastrarRota();
		LocalColeta("carrefour - brooklin");
		AtribuirMotorista("Gabriel Conrado");
		DataHoraColeta();
		TituloRota(TituloRota);
		SelecionarPedido();
		Confirmar();
		
		Assert.assertEquals(TituloRota , ValidaTituloRota());
		Assert.assertEquals("Gabriel Conrado... ELK-1111", ValidaMotorista());
		
	}
	
	public void Url (String url) {
		
		driver.get(url);
		
	}
	
	public void Rotas () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//ul/li[@class = 'BaseMenu__li'])[3]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul/li[@class = 'BaseMenu__li'])[3]")).click();
		
	}
	
	public void CadastrarRota () throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'BaseButton TheSubHeader__button BaseButton--mustard BaseButton--icon-right TheSubHeader__button--addnew']")));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class = 'BaseButton TheSubHeader__button BaseButton--mustard BaseButton--icon-right TheSubHeader__button--addnew']")).click();
		
	}
	
	public void LocalColeta ( String localColeta ) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'multiselect BaseMultiselect__input']")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class = 'multiselect BaseMultiselect__input']")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Pesquisar Lojistas']")).sendKeys(localColeta);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class = 'multiselect__element']")));
		driver.findElement(By.xpath("//li[@class = 'multiselect__element']")).click();
		
	}
	
	public void AtribuirMotorista ( String atribuirMotorista ) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'multiselect BaseMultiselect__input'])[2]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class = 'multiselect BaseMultiselect__input'])[2]")).click();
		driver.findElement(By.xpath("//input[@placeholder = 'Pesquisar']")).sendKeys(atribuirMotorista);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class = 'multiselect__element']")));
		driver.findElement(By.xpath("//li[@class = 'multiselect__element']")).click();
		
	}
	
	public void DataHoraColeta () throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[@class = 'mx-datepicker'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//table[@class = 'mx-panel mx-panel-date'])[1]/tbody/tr/td[@class = 'cell cur-month today']")).click();
		
	}
	
	public void TituloRota ( String tituloRota ) {
		
		driver.findElement(By.xpath("//input[@class = 'InputGroup__input']")).click();
		driver.findElement(By.xpath("//input[@class = 'InputGroup__input']")).sendKeys(tituloRota);
		
	}
	
	public void SelecionarPedido () {
		
		driver.findElement(By.xpath("(//td[@class = 'DataTableTd'])[1]")).click();
		
	}
	
	public void Confirmar () throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@class = 'BaseButton BaseButton--mustard BaseButton--icon-right BaseButton--filled DynamicForm__confirm ']")).click();
		Thread.sleep(3000);
		
	}
	
	public String ValidaTituloRota () throws InterruptedException {
			
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//tbody[@class = 'DataTable__tbody']/tr/td)[4]/span[2]")));
		Thread.sleep(5000);
		return driver.findElement(By.xpath("(//tbody[@class = 'DataTable__tbody']/tr/td)[4]/span[2]")).getText();
				
	}
	
	public String ValidaMotorista () {
		
		return driver.findElement(By.xpath("(//tbody[@class = 'DataTable__tbody']/tr/td)[5]/span[2]")).getText();
						
	}
	
	
	
	
	
	
	
	
	

}
