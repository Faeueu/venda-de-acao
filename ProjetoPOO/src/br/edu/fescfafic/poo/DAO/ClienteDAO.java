package br.edu.fescfafic.poo.DAO;

import br.edu.fescfafic.poo.Model.Cliente;

import java.util.ArrayList;

public class ClienteDAO extends DAO<Cliente>{
    public ClienteDAO() {}

        public ArrayList<Cliente> buscarCliente(String nome){
            ArrayList<Cliente> clientes = new ArrayList<>();
            for (Cliente clnt: this.bancoDeDados) {
                if (clnt.getNome().equals(nome)){
                    clientes.add(clnt);
                }
            }
            return clientes;
        }

    public boolean remove(Cliente nome) {
        return this.bancoDeDados.remove(nome);
    }
}
