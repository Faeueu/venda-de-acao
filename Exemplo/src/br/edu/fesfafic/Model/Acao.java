package br.edu.fesfafic.Model;

import br.edu.fesfafic.Interface.InterfaceIdentificadora;

import java.util.UUID;

public class Acao implements InterfaceIdentificadora {
    public String ticker;
    public String nome;
    public Double preco;
    public Integer quantidade;

    public Acao(String ticker, String nome, Double preco, Integer quantidade) {
        this.ticker = ticker;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "ticker='" + ticker + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public UUID getId() {
        return null;
    }
}



