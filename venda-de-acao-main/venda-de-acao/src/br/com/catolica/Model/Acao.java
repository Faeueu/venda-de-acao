package br.com.catolica.Model;

import br.com.catolica.DAO.AcaoDAO;

public class Acao extends AcaoDAO {

    public String ticker;
    public String nomeEmpresa;
    public double precoUnitario;
    public int quantidade;


    public Acao(String ticker, String nomeEmpresa, double precoUnitario, int quantidade) {
        this.ticker = ticker;
        this.nomeEmpresa = nomeEmpresa;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public Acao(){}

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
                "ticker='" + ticker + '\'' +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                ", precoUnitario=" + precoUnitario +
                ", quantidade=" + quantidade +
                '}'+"\n";
    }
}
