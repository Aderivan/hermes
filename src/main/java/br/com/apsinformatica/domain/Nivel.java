package br.com.apsinformatica.domain;

public enum Nivel {
	UM("1"), DOIS("2"), TRES("3");

	private String descricao;

	Nivel(String value) {
		this.descricao = value;
	}

	public String getDescricao() {
		return descricao;
	}

}
