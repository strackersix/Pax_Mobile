package br.com.testes.Mobile;

import org.junit.Test;

import br.com.pages.Mobile.LogoutMobile;

public class TestLogoutMobile {

	LogoutMobile Step = new LogoutMobile();

	@Test
	public void ExecutaTestLogout() {

		Step.Sair();

	}

}
