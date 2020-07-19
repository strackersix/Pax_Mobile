package br.com.testes.Mobile;

import org.junit.Test;

import br.com.pages.Mobile.RegistrarOcorrenciaTodosPedidos;
import org.junit.Assert;

public class TestRegistrarOcorrenciaTodosPedidos {

	RegistrarOcorrenciaTodosPedidos Step = new RegistrarOcorrenciaTodosPedidos();

	@Test
	public void ExecutaRegistrarOcorrencia() {

		Step.VerificaExistenciaPedido();
		while (RegistrarOcorrenciaTodosPedidos.ExistePedido.equalsIgnoreCase("OCORRÊNCIA")) {
			
			try {
				
				Step.Ocorrencia();
				Step.EscreverAqui("Produto extraviado.");
				Step.SelecionarStatus();
				Step.Extravio();
				Step.Ok();
				Step.Registrar();

			} catch (Throwable e) {

				Assert.assertEquals("Não há pedidos para exibir.", Step.ExistePedidos());
			
			}
						
		}

	}

}
