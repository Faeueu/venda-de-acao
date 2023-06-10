package br.com.catolica.Model;

public class EstruturaVenda {

    private Acao acao;
    private Cliente cliente;
    private Funcionario vendedor;
    private double valorVenda;

    public EstruturaVenda(Acao acao, Cliente cliente, Funcionario vendedor, double valorVenda) {
        this.acao = acao;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.valorVenda = valorVenda;
    }

    public Acao getAcao() {
        return acao;
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    @Override
    public String toString() {
        return "VendaAcao{" +
                "acao=" + acao +
                ", cliente=" + cliente +
                ", vendedor=" + vendedor +
                ", valorVenda=" + valorVenda +
                '}';
    }
}
