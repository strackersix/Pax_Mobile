package br.com.testes.Mobile;

import org.junit.Test;

import br.com.pages.Mobile.RegistrarEntregueTodosPedidos;
import org.junit.Assert;

public class TestRegistrarEntregueTodosPedidos {

	RegistrarEntregueTodosPedidos Step = new RegistrarEntregueTodosPedidos();

	@Test
	public void ExecutaRegistrarEntregueTodosPedidos() throws InterruptedException {

		Step.VerificaExistenciaPedido();
		while (RegistrarEntregueTodosPedidos.ExistePedido.equalsIgnoreCase("ENTREGUE")) {

			try {

				Step.Entregue();
				Step.SelecionarStatus();
				Step.NomeRecebedor("Gabriel Conrado");
				Step.DocumentoRecebedor("35.815.674-9");
				Step.Confirmar();

			} catch (Throwable e) {

				Assert.assertEquals("Não há pedidos para exibir.", Step.ExistePedidos());
				
			}

		}

	}

}
