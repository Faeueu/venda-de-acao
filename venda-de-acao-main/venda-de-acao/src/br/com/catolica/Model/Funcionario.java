package br.com.catolica.Model;

import java.util.UUID;

public class Funcionario {

    private String cracha;
    public String nome;

    public Funcionario(String cracha, String nome) {
        this.cracha = cracha;
        this.nome = nome;
    }

    public String getCracha() {
        return cracha;
    }

    public void setCracha(String cracha) {
        this.cracha = cracha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cracha='" + cracha + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
