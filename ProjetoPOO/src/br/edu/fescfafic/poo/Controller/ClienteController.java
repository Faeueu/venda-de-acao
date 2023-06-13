package br.edu.fescfafic.poo.Controller;
import br.edu.fescfafic.poo.DAO.ClienteDAO;
import br.edu.fescfafic.poo.Model.Cliente;

import java.util.ArrayList;

public class ClienteController {

    ClienteDAO clienteDAO = new ClienteDAO();
    public boolean inserir(Cliente cliente) {
        if (cliente.getCpf().length() == 11) {
            return this.clienteDAO.inserir(cliente);
        }
        return false;
    }
    public ArrayList<Cliente> buscarClientePorNome(String nome){
        if (nome.length() >= 3){
            return this.clienteDAO.buscarCliente(nome);
        }
        return null;
    }
    public void atualizarCliente(int posicao, Cliente nome){
            this.clienteDAO.atualizar(posicao, nome);
    }
    public boolean remover(Cliente nome) {
        return this.clienteDAO.remove(nome);
    }
}