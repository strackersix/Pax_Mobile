package br.com.pages.Web;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.BasePage;
import br.com.core.Parametros;
import br.com.testes.Web.TestCadastrarPedidoWeb;
import br.com.utils.Random;


public class CadastrarPedidoWeb extends BasePage {

	public static String pedido = Random.randomNumeric(5);
	public static String cadastropedidonotafiscal = Random.randomNumeric(6);
	public static String cadastropedidonome = "Teste Automatizado - " + Random.randomAlfabeto(5);
	public static String celular = "119" + Random.randomNumeric(12);
	public static String email = "automacao.qa" + Random.randomAlphaNumeric(5) + "@paxexpress.com.br";
	public static String cadastropedidodocumento = Random.randomNumeric(10);
	public static String cadastropedidonumero = Random.randomNumeric(3);
	public static String cadastropedidocomplemento = Random.randomAlphaNumeric(3);
	public static String cadastropedidoprodutopeso = Random.randomNumeric(2);
	
	public void CenarioCadastrarPedidoWeb () throws InterruptedException {
		
		Url(Parametros.UrlPax);
		ClicarPedido();
		ClicarCadastrarPedido();
		CadastroPedidoVincularLojistas("Carrefour - Brooklin");
		ClicarVincularTransportadora();
		CadastroPedidoNumeroPedido(pedido);
		CadastroPedidoNotaFiscal(cadastropedidonotafiscal);
		CadastroPedidoNome(cadastropedidonome);
		celular(celular);
		CadastroPedidoEmail(email);
		CadastroPedidoDocumento(cadastropedidodocumento);
		ClicarDocumento(Parametros.CPF);
		CadastroPedidoCep("05010-020");
		CadastroPedidoNumero("62");
		CadastroPedidoComplemento(cadastropedidocomplemento);
		CadastroPedidoProdutoNome("Automacao_QA");
		CadastroPedidoProdutoPeso(cadastropedidoprodutopeso);
		CadastroPedidoTamanho();
		CadastroPedidoEnviar();
		PesquisarPedido(pedido);
		

		Assert.assertEquals(pedido, ValidarNumeroPedido());
		
		
	}
	
	public void Url ( String url ) {
		
		driver.get(url);
		
	}
	
	
	public void ClicarPedido() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='BaseMenuLink BaseMenuLink--header'])[1]")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='BaseMenuLink BaseMenuLink--header'])[1]")).click();
	}
	
	public void ClicarCadastrarPedido() throws InterruptedException{
	    
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='BaseButton__Text BaseButton--mustard-Text']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='BaseButton__Text BaseButton--mustard-Text']")).click();
		
	}
	
	public void CadastroPedidoVincularLojistas(String cadastropedidovincularlojistas) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//div//span[@class='multiselect__placeholder']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class = 'BaseMultiselect__Arrow BaseMultiselect__Arrow--close']")).click();
		driver.findElement(By.xpath("//div/input[@class='multiselect__input']")).sendKeys(cadastropedidovincularlojistas);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/input[@class='multiselect__input']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
					
	}
	
	public void ClicarVincularTransportadora() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'BaseSelect__selectedContainer'])[1]")));
		driver.findElement(By.xpath("(//div[@class = 'BaseSelect__selectedContainer'])[1]")).click();
		driver.findElement(By.xpath("//div[@title='Pax']")).click();
		
	}
	
	public void CadastroPedidoNumeroPedido(String cadastropedidonumeropedido) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//input[@class='InputGroup__input'])[1]")));
		driver.findElement(By.xpath("(//div//input[@class='InputGroup__input'])[1]")).click();
		driver.findElement(By.xpath("(//div//input[@class='InputGroup__input'])[1]")).sendKeys(cadastropedidonumeropedido);
		
	}
	
	public void CadastroPedidoNotaFiscal(String cadastropedidonotafiscal) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[2]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[2]")).click();
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[2]")).sendKeys(cadastropedidonotafiscal);
		
	}
	
	public void CadastroPedidoNome(String cadastropedidonome) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[3]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[3]")).sendKeys(cadastropedidonome);
	}
	
	public void celular(String celular) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[4]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[4]")).sendKeys(celular);
	
	}
	
	public void CadastroPedidoEmail(String cadastropedidoemail) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[5]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[5]")).sendKeys(cadastropedidoemail);
		
	}
	
	public void CadastroPedidoDocumento(String cadastropedidodocumento) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'BaseSelect__selectedContainer'])[2]")));
		driver.findElement(By.xpath("(//div[@class = 'BaseSelect__selectedContainer'])[2]")).click();
		driver.findElement(By.xpath("//div//div[@title='CPF']")).click();
	}
	
	public void ClicarDocumento(String clicardocumento) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//input[@class='InputGroup__input'])[6]")));
		driver.findElement(By.xpath("(//div//input[@class='InputGroup__input'])[6]")).sendKeys(clicardocumento);
		
		
	}
	
	public void CadastroPedidoCep(String cadastropedidocep) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[13]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[13]")).sendKeys(cadastropedidocep);
	
	}
	
	public void CadastroPedidoNumero(String cadastropedidonumero) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[15]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[15]")).sendKeys(cadastropedidonumero);
	}
	
	public void CadastroPedidoComplemento(String cadastropedidocomplemento) throws InterruptedException{
	
//		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[16]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[16]")).sendKeys(cadastropedidocomplemento);
		
	}
	
	public void CadastroPedidoProdutoNome(String cadastropedidoprodutonome) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[19]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[19]")).sendKeys(cadastropedidoprodutonome);
			
	}
	
	public void CadastroPedidoProdutoPeso(String cadastropedidoprodutopeso) throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div//div//input[@class='InputGroup__input'])[20]")));
		driver.findElement(By.xpath("(//div//div//input[@class='InputGroup__input'])[20]")).sendKeys(cadastropedidoprodutopeso);
		
	}
	
	public void CadastroPedidoTamanho() throws InterruptedException{
		
		WebDriverWait wait = new WebDriverWait (driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'BaseSelect__selectedContainer'])[5]")));
		driver.findElement(By.xpath("(//div[@class = 'BaseSelect__selectedContainer'])[5]")).click();
		driver.findElement(By.xpath("(//div//div//div[@title='P - (Ex.: 10x20 cm)'])")).click();
		
	}
	
	public void WaitLoading() {
		
		try {

			WebDriverWait wait = new WebDriverWait(driver, 3);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'sk-folding-cube']")));
			String loading = driver.findElement(By.xpath("//div[@class = 'sk-folding-cube']")).getAttribute("class");
			int count = 1;
			
			while (loading != "sk-folding-cube") {

				Thread.sleep(1000);
				count++;
				System.out.println("Loading: " + count + " segundos.");
				loading = driver.findElement(By.xpath("//div[@class = 'sk-folding-cube']")).getAttribute("class");
				
				if (count == 30) {
					
					Assert.fail("O loading durou mais do que 30 segundos.");
					
				}
			}
			
		} catch (Exception e) {
			
		}

	}
	
	public void CadastroPedidoEnviar() throws InterruptedException{
				
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'BaseButton BaseButton--mustard BaseButton--icon-left BaseButton--filled DynamicForm__confirm ']")));
		driver.findElement(By.xpath("//button[@class = 'BaseButton BaseButton--mustard BaseButton--icon-left BaseButton--filled DynamicForm__confirm ']")).click();
		
	}
	
	public void PesquisarPedido ( String pesquisarPedido ) throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'multiselect BaseMultiselect__input'])[4]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class = 'multiselect BaseMultiselect__input'])[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder = 'Pesquisar']")).sendKeys(pesquisarPedido);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class = 'multiselect__content-wrapper'])[4]")).click();
		
	}
	
	public String ValidarNumeroPedido() throws InterruptedException{
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='DataTableTd__Content DataTable--limit'])[2]")));
		Thread.sleep(2000);
		return driver.findElement(By.xpath("(//span[@class='DataTableTd__Content DataTable--limit'])[2]")).getText();
		
	}
		



}
