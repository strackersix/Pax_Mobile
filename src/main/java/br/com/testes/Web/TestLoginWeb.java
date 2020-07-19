package br.com.testes.Web;

import org.junit.Test;

import br.com.core.Parametros;
import br.com.pages.Web.LoginWeb;

public class TestLoginWeb {

	LoginWeb Step = new LoginWeb();

	@Test

	public void ExecutarTestLogin() throws InterruptedException {

		Step.Url(Parametros.UrlPax);
		Step.Login(Parametros.UsuarioPax1);
		Step.Senha(Parametros.SenhaPax1);
		Step.BotaoEntrar();		
	
	}
	
}