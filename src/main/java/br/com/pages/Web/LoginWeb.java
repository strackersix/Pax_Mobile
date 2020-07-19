package br.com.pages.Web;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.core.DriverFactoryWeb;
import br.com.core.Parametros;

public class LoginWeb extends DriverFactoryWeb {

	public void CenarioLogin () throws InterruptedException {
		
		Url(Parametros.UrlPax);
		Login(Parametros.UsuarioPax1);
		Senha(Parametros.SenhaPax1);
		BotaoEntrar();	
		
	}
	
	public void Url(String url) {

		driver.get(url);

	}

	public void Login ( String login ) throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(login);
		
	}

	public void Senha ( String senha ) {

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(senha);
	
	}

	public void BotaoEntrar() throws InterruptedException {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
	}
		
	public String ValidaLogin () {
		
		return driver.findElement(By.xpath("//div/button/span[@id = 'be-menu-profile-name']")).getText();
				
	}
	
	public String ValidaUsuario1() {
		
		return driver.findElement(By.xpath("//span[@id='be-menu-profile-name']")).getText();
		
	}


}
