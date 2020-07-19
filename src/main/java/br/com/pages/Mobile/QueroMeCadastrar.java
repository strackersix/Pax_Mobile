package br.com.pages.Mobile;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.DriverFactoryMobile;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class QueroMeCadastrar extends DriverFactoryMobile {
	
	
	public void QueroCadastrar () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@text = 'Quero me cadastrar']")));
		driver.findElement(By.xpath("//android.view.View[@text = 'Quero me cadastrar']")).click();
		
	}
	
	public void Nome ( String nome ) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View/android.view.View[2]/android.widget.EditText")));
		driver.findElement(By.xpath("//android.view.View[@text = 'Nome']/../android.view.View[2]/android.widget.EditText")).sendKeys(nome);

	}
	
	public void Celular ( String celular ) {

		driver.findElement(By.xpath("//android.view.View[@text = 'Celular']/../android.view.View[2]/android.widget.EditText")).sendKeys(celular);
		
	}

	public void Email ( String email ) {

		driver.findElement(By.xpath("//android.view.View[@text = 'E-mail']/../android.view.View[2]/android.widget.EditText")).sendKeys(email);
		
	}
	
	public void DataNascimento ( String dataNascimento ) {

		driver.findElement(By.xpath("//android.view.View[@text = 'Data de nascimento']/../android.view.View[2]/android.widget.EditText")).sendKeys(dataNascimento);
		
	}
	
	public void Rg ( String rg ) throws InterruptedException {

		driver.findElement(By.xpath("//android.view.View[@text = 'RG']/../android.view.View[2]/android.widget.EditText")).sendKeys(rg);
		
	}
	
	public void ScrollBar ( double inicio, double fim ) throws InterruptedException {
		
		Dimension size = driver.manage().window().getSize();
		
		int x = size.width / 2;
		int start_y = (int)(size.height * inicio);
		int end_y = (int) (size.height * fim);
		
		new TouchAction<>(driver)
		.press(PointOption.point(new Point(x, start_y)))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
		.moveTo(PointOption.point(new Point(x, end_y)))
		.release()
		.perform();
			
	}
	
	public void Cpf ( String cpf ) {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'CPF']/../android.view.View[2]/android.widget.EditText")).sendKeys(cpf);
		
	}
	
	public void Cnh ( String cnh ) {

		driver.findElement(By.xpath("//android.view.View[@text = 'CNH']/../android.view.View[2]/android.widget.EditText")).sendKeys(cnh);
		
	}
	
	public void Validade ( ) {

		driver.findElement(By.xpath("//android.view.View[@text = 'Validade']/../android.view.View[2]/android.widget.EditText")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Button")));
		driver.findElement(By.xpath("//android.view.View/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.Button")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@resource-id = '5list']")));
		driver.findElement(By.xpath("//android.view.View[@resource-id = '5list']")).click();
		WebDriverWait wait3 = new WebDriverWait(driver, 10);
		wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@bounds = '[570,295][915,415]']")));
		driver.findElement(By.xpath("//android.widget.Button[@bounds = '[570,295][915,415]']")).click();
		WebDriverWait wait4 = new WebDriverWait(driver, 10);
		wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@text = '2025']")));
		driver.findElement(By.xpath("//android.view.View[@text = '2025']")).click();
		WebDriverWait wait5 = new WebDriverWait(driver, 10);
		wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@text = '15']")));
		driver.findElement(By.xpath("//android.view.View[@text = '15']")).click();

	}
	
	public void Cep ( String cep ) throws InterruptedException {

		driver.findElement(By.xpath("//android.view.View[@text = 'CEP']/../android.view.View[2]/android.widget.EditText")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.view.View[@text = 'CEP']/../android.view.View[2]/android.widget.EditText")).sendKeys(cep);
		driver.navigate().back();
						
	}
	
	public void Numero ( String numero ) {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'Número']/../android.view.View[2]/android.widget.EditText")).sendKeys(numero);
		
	}
		
	public void Complemento ( String complemento ) {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'Complemento']/../android.view.View[2]/android.widget.EditText")).sendKeys(complemento);
		
	}
	
	public void Placa ( String placa ) {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'Placa']/../android.view.View[2]/android.widget.EditText")).sendKeys(placa);
		
	}
	
	public void Fabricante ( String fabricante ) {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'Fabricante']/../android.view.View[3]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@bounds = '[21,280][1059,394]']")));
		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[21,280][1059,394]']")).sendKeys(fabricante);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@text = 'radio button off SUBARU']")));
		driver.findElement(By.xpath("//android.widget.Button[@text = 'radio button off SUBARU']")).click();		
		
	}
	
	public void Modelo ( String modelo ) {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'Modelo']/../android.view.View[3]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@bounds = '[21,280][1059,394]']")));
		driver.findElement(By.xpath("//android.widget.EditText[@bounds = '[21,280][1059,394]']")).sendKeys(modelo);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@bounds = '[0,445][1080,589]']")));
		driver.findElement(By.xpath("//android.widget.Button[@bounds = '[0,445][1080,589]']")).click();
		
	}
	
	public void Ano () {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'Ano']/../android.view.View[2]/android.widget.Button")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RadioButton[@text = '2021']")));
		driver.findElement(By.xpath("//android.widget.RadioButton[@text = '2021']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text = 'OK']")).click();
		
	}
	
	public void RegistroANTT ( String registroANTT ) {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'Registro ANTT']/../android.view.View[2]/android.widget.EditText")).sendKeys(registroANTT);
		
	}	
	
	public void Renavam ( String Renavam ) {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'RENAVAM']/../android.view.View[2]/android.widget.EditText")).sendKeys(Renavam);
		
	}
	
	public void Banco ( String banco ) {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'Banco']/../android.view.View[3]")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Image[@text = 'search']/../android.widget.EditText")));
		driver.findElement(By.xpath("//android.widget.Image[@text = 'search']/../android.widget.EditText")).sendKeys(banco);
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@bounds = '[0,445][1080,589]']")));
		driver.findElement(By.xpath("//android.widget.Button[@bounds = '[0,445][1080,589]']")).click();
		
	}
	
	public void TipoConta () {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'Tipo de conta']/../android.view.View[3]")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.Button[@bounds = '[0,277][1080,421]']")));
		driver.findElement(By.xpath("//android.widget.Button[@bounds = '[0,277][1080,421]']")).click();
		
	}
	
	public void Agencia ( String agencia ) {
		
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.view.View[@text = 'Agência']/../android.view.View[2]/android.widget.EditText")));
		driver.findElement(By.xpath("//android.view.View[@text = 'Agência']/../android.view.View[2]/android.widget.EditText")).sendKeys(agencia);
		
	}
	
	public void Conta ( String conta ) {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'Conta']/../android.view.View[2]/android.widget.EditText")).sendKeys(conta);
		
	}
	
	public void Senha ( String senha ) {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'Senha']/../android.view.View[2]/android.widget.EditText")).sendKeys(senha);
		
	}
	
	public void ConfirmarSenha ( String confirmarSenha ) {
		
		driver.findElement(By.xpath("//android.view.View[@text = 'Confirmar senha']/../android.view.View[2]/android.widget.EditText")).sendKeys(confirmarSenha);
		
	}
	
	public void AceitoOsTermos () {
		
		driver.findElement(By.xpath("//android.widget.CheckBox/android.widget.Button")).click();
		
	}
	
	public void Cadastrar () {
		
		driver.findElement(By.xpath("//android.widget.Button[@text = 'CADASTRAR']")).click();
		
	}
	

}
