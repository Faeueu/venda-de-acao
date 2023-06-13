package br.edu.fescfafic.poo.Model;

import br.edu.fescfafic.poo.Interface.InterfaceVerificar;

import java.util.UUID;

public class Acao implements InterfaceVerificar {
    UUID id;
    String ticker;
    String nomeEmpresa;
    double precoUnitario;
    int quantidade;

    public Acao(String ticker, String nomeEmpresa, double precoUnitario, int quantidade) {
        this.id = UUID.randomUUID();
        this.ticker = ticker;
        this.nomeEmpresa = nomeEmpresa;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Acao{" +
                "id=" + id +
                ", ticker='" + ticker + '\'' +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", precoUnitario=" + precoUnitario +
                ", quantidade=" + quantidade +
                '}';
    }
}