package br.com.catolica.Model;


import br.com.catolica.Interface.VerifiPessoa;

import java.util.UUID;

public class Cliente implements VerifiPessoa {

    private UUID id;

    public String nome;

    private String cpf;

    public Cliente(){}

    public Cliente(String nome, String cpf) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}