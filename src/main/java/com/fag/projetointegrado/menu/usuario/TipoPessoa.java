package com.fag.projetointegrado.menu.usuario;

public enum TipoPessoa
{
    PESSOA_FISICA(1l, "Pessoa Física"),
    PESSOA_JURIDICA(2l, "Pessoa Jurídica");

    private final Long id;
    private final String nome;

    TipoPessoa(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
