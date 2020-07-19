package br.com.testes.Web;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import br.com.core.Parametros;
import br.com.pages.Web.CadastrarPedidoWeb;
import br.com.utils.Random;

public class TestCadastrarPedidoWeb {

	CadastrarPedidoWeb Step = new CadastrarPedidoWeb();

	public static String pedido = Random.randomNumeric(5);
	public static String cadastropedidonotafiscal = Random.randomNumeric(6);
	public static String cadastropedidonome = "Teste Automatizado - " + Random.randomAlfabeto(5);
	public static String celular = "119" + Random.randomNumeric(12);
	public static String email = "automacao.qa" + Random.randomAlphaNumeric(5) + "@paxexpress.com.br";
	public static String cadastropedidodocumento = Random.randomNumeric(10);
	public static String cadastropedidonumero = Random.randomNumeric(3);
	public static String cadastropedidocomplemento = Random.randomAlphaNumeric(3);
	public static String cadastropedidoprodutopeso = Random.randomNumeric(2);
	
	@Test
	public void TestCadastarPedido() throws InterruptedException, IOException {

		Step.Url(Parametros.UrlPax);
		Step.ClicarPedido();
		Step.ClicarCadastrarPedido();
		Step.CadastroPedidoVincularLojistas("Carrefour - Brooklin");
		Step.ClicarVincularTransportadora();
		Step.CadastroPedidoNumeroPedido(pedido);
		Step.CadastroPedidoNotaFiscal(cadastropedidonotafiscal);
		Step.CadastroPedidoNome(cadastropedidonome);
		Step.celular(celular);
		Step.CadastroPedidoEmail(email);
		Step.CadastroPedidoDocumento(cadastropedidodocumento);
		Step.ClicarDocumento(Parametros.CPF);
		Step.CadastroPedidoCep("05010-020");
		Step.CadastroPedidoNumero("62");
		Step.CadastroPedidoComplemento(cadastropedidocomplemento);
		Step.CadastroPedidoProdutoNome("Automacao_QA");
		Step.CadastroPedidoProdutoPeso(cadastropedidoprodutopeso);
		Step.CadastroPedidoTamanho();
		Step.WaitLoading();
		Step.CadastroPedidoEnviar();
		Step.PesquisarPedido(pedido);
		
		Assert.assertEquals(pedido, Step.ValidarNumeroPedido());
		
	}
}
