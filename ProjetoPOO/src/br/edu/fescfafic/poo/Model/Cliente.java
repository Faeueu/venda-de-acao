package br.edu.fescfafic.poo.Model;

import br.edu.fescfafic.poo.Interface.InterfaceVerificar;

import java.util.UUID;

public class Cliente implements InterfaceVerificar {
    UUID id;
    String cpf;
    String nome;

    public Cliente(UUID id, String cpf, String nome) {
        this.id = UUID.randomUUID();
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
