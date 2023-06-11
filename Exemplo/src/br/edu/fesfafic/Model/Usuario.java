package br.edu.fesfafic.Model;

import br.edu.fesfafic.Interface.InterfaceIdentificadora;

import java.util.UUID;

public class Usuario implements InterfaceIdentificadora {

    public UUID id;
    public String nome;
    public String cpf;

    public Usuario(String nome,String cpf) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
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
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public UUID getId() {
        return null;
    }
}
