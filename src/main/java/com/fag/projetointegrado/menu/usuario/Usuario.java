package com.fag.projetointegrado.menu.usuario;

import com.fag.projetointegrado.menu.carrinho.Pedido;

import java.util.Date;
import java.util.List;

public class Usuario
{
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private String cnpj;
    private TipoPessoa tipoPessoa;
    private String telefone;
    private String email;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String complemento;
    private String cep;
    private Boolean ativo;
    private Date nascimento;
    private Date dataCadastro;
    private String senha;
    private List<Pedido> historicoDePedidos;

}
