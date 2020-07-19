package br.com.testes.Mobile;

import org.junit.Test;

import br.com.pages.Mobile.ConsultarPedidoCadastradoWeb;
import br.com.testes.Web.TestCadastrarPedidoWeb;
import org.junit.Assert;

public class TestConsultarPedidoCadastradoWeb {

	ConsultarPedidoCadastradoWeb Step = new ConsultarPedidoCadastradoWeb();

	@Test
	public void ExecutaConsultarPedido() throws InterruptedException {

		try {
			
			Step.NumeroPedido(TestCadastrarPedidoWeb.pedido);
			Step.Pesquisar();
			
			Assert.assertEquals(TestCadastrarPedidoWeb.pedido + " " + TestCadastrarPedidoWeb.cadastropedidonome, Step.ValidaCadastroPedidoNotaFiscal());
			
			Assert.assertEquals("NF " + TestCadastrarPedidoWeb.cadastropedidonotafiscal, Step.ValidaNotaFiscalPedido());
			Assert.assertEquals("ENDEREÇO DE ENTREGA", Step.EnderecoEntrega());
			Assert.assertEquals("Rua Professor Pedro da Cunha, 62", Step.Rua());
			Assert.assertEquals("Bairro: Perdizes", Step.Bairro());
			Assert.assertEquals("Cidade: São Paulo", Step.Cidade());
			Assert.assertEquals("Estado:", Step.Estado());
			Assert.assertEquals("CEP: 05010020", Step.CEP());

			Step.LimparNumeroPedido();

		} catch (Throwable e) {

			Step.Atualizar();
			Assert.fail("Pedido não localizado.");
			
		}

	}

}
