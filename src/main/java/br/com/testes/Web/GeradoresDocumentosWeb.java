package br.com.testes.Web;

import org.junit.Test;

import br.com.pages.Web.GeradoresDocWeb;

public class GeradoresDocumentosWeb {

	GeradoresDocWeb Step = new GeradoresDocWeb();
	
	@Test
	
	public void ExecutaFourDevs () throws InterruptedException {
			
		Step.Url("https://www.treinaweb.com.br/ferramentas-para-desenvolvedores/gerador/cnh#ui-basic");
		Step.CapturarCPF();
		Step.CapturarRG();
		Step.CapturarCNPJ();
		Step.CapturarCNH();
		Step.CapturarRENAVAM();
		
		
		
		
		
		
	}
	
	
}
