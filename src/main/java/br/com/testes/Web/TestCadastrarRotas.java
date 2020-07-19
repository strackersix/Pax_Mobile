package br.com.testes.Web;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.DriverFactoryWeb;
import br.com.core.Parametros;
import br.com.pages.Web.CadastrarRotas;
import br.com.utils.Random;

public class TestCadastrarRotas {

	private static String TituloRota = "Rota: " + Random.randomNumeric(5);
	
	CadastrarRotas Step = new CadastrarRotas();
	
	@Test
	public void ExecutaTestRotas () throws InterruptedException {
				
		Step.Url(Parametros.UrlPax);
		Step.Rotas();
		Step.CadastrarRota();
		Step.LocalColeta("carrefour - brooklin");
		Step.AtribuirMotorista("Gabriel Conrado");
		Step.DataHoraColeta();
		Step.TituloRota(TituloRota);
		Step.SelecionarPedido();
		Step.Confirmar();
		
		Assert.assertEquals(TituloRota , Step.ValidaTituloRota());
		Assert.assertEquals("Gabriel Conrado... ELK-1111", Step.ValidaMotorista());
		
		DriverFactoryWeb.FinalizarDriverFactory();
		
		
		
		
	}
		
}
