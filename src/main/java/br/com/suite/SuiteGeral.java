package br.com.suite;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.core.DriverFactoryMobile;
import br.com.core.DriverFactoryWeb;
import br.com.testes.Mobile.*;
import br.com.testes.Web.*;

	@RunWith(Suite.class)
	@SuiteClasses({	
			
////  Web
//	GeradoresDocumentosWeb.class,
//	TestLoginWeb.class,
//	TestCadastrarPedidoWeb.class,
//	TestCadastrarRotas.class,
				
//  Mobile		
	TestLoginMobile.class,
	TestConsultarPedidoCadastradoWeb.class,
	TestRegistrarEntregueTodosPedidos.class,
	TestRegistrarOcorrenciaTodosPedidos.class,
	TestValidarMeusDadosMobile.class,
	TestLogoutMobile.class,
	TestQueroMeCadastrar.class,	
			
	
 
})

public class SuiteGeral  { 

	@AfterClass
	public static void Finalizar() throws InterruptedException {
		
//		DriverFactoryMobile.FinalizarDriverFactory();
//		DriverFactoryWeb.FinalizarDriverFactory();
			
	}
			
}
	