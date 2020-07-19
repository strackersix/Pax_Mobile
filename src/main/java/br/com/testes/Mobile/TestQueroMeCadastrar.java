package br.com.testes.Mobile;

import org.junit.Test;

import br.com.pages.Mobile.QueroMeCadastrar;

public class TestQueroMeCadastrar {
	
	QueroMeCadastrar Step = new QueroMeCadastrar();
	
	@Test
	public void ExecutaQueroMeCadastrar() throws InterruptedException {
		
		Step.QueroCadastrar();
		Step.Nome("Gabriel Conrado");
		Step.Celular("11981699678");
		Step.Email("gabriel.souza@doc88.com.br");
		Step.DataNascimento("29/10/1986");
		Step.ScrollBar(0.7, 0.1);
		Step.Rg("25.365.912-7");
		Step.Cpf("875.551.020-56");		
		Step.Cnh("59534231001");
		Step.Validade();
		Step.Cep("04542-080");
		Step.ScrollBar(0.3, 0.1);
		Step.Numero("97");
		Step.Complemento("Casa B");
		Step.ScrollBar(0.7, 0.1);
		Step.Placa("ELK3050");
		Step.Fabricante("Subaru");
		Step.Modelo("Impreza 1.5 16V 115cv Aut.");
		Step.Ano();
		Step.RegistroANTT("123456789");
		Step.Renavam("03483450493");
		Step.ScrollBar(0.7, 0.1);
		Step.Banco("ITAÚ UNIBANCO S/A");
		Step.TipoConta();
		Step.Agencia("4546");
		Step.Conta("99656-7");
		Step.Senha("123456");
		Step.ConfirmarSenha("123456");
		Step.AceitoOsTermos();
		Step.Cadastrar();

		
	}
	
}
