package br.com.apsinformatica.infra;

import br.com.apsinformatica.domain.Login;

public class Session implements java.io.Serializable {
	private static Session instance;

	private Session() {
	}

	public static Session instance() {
		if (instance == null) {
			instance = new Session();
		}
		return instance;
	}

	public Login getUsuario() { 
		return (Login) SessionUtil.getSessionObject("usuario");
	}

	public void setUsuario(Login pLogin) {
		SessionUtil.setSession("usuario", pLogin);
	}

}
