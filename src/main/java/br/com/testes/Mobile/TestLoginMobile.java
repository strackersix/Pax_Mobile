package br.com.testes.Mobile;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.Parametros;
import br.com.pages.Mobile.LoginMobile;

public class TestLoginMobile {
	
	
	LoginMobile Step = new LoginMobile();
	
	@Test
	public void ExecutaLogin () {
	
		Step.Usuario(Parametros.Usuario);
		Step.Senha(Parametros.Senha);
		Step.btnLogin();
		Step.PermitirLocalizacao();
		
		Assert.assertEquals("Meus pedidos", Step.MeusPedidos());

		
	}

}
