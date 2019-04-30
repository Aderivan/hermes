package br.com.apsinformatica.domain;

public class Login implements java.io.Serializable {

	private String usuario;
	private String nome;
	private String email;

	public Login() {
		usuario = "";
		nome = "";
		email = "";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
