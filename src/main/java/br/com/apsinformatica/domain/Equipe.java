package br.com.apsinformatica.domain;

public enum Equipe {
    A("1"),
    B("2"),
    C("3"),
    D("4"),
    F("5"),
    S("6");

    private String descricao;

    Equipe(String value) {
        this.descricao = value;
    }

    public String getDescricao() {
        return descricao;
    }

}
