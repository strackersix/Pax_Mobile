package br.com.testes.Mobile;

import org.junit.Assert;
import org.junit.Test;

import br.com.pages.Mobile.ValidarMeusDadosMobile;

public class TestValidarMeusDadosMobile {
	
	ValidarMeusDadosMobile Step = new ValidarMeusDadosMobile();
	
	@Test
	public void ExecutaMeusDados () {
		
		Step.MeusDados();

		Assert.assertEquals("Gabriel Conrado", Step.ValidaNome());
		Assert.assertEquals("(11) 98169-9678", Step.ValidaContato());
		Assert.assertEquals("gabriel.souza@doc88.com.br", Step.ValidaEmail());
		Assert.assertEquals("ELK1111", Step.ValidaPlaca());
		Assert.assertEquals("Pax", Step.ValidaTransportadora());
		
		
	}

}
