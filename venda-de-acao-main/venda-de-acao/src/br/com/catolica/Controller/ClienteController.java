package br.com.catolica.Controller;


import br.com.catolica.DAO.PessoaDAO;
import br.com.catolica.Model.Cliente;

public class ClienteController extends PessoaDAO {

    PessoaDAO pessoaDAO = new PessoaDAO();

    public boolean addPessoa(Cliente cliente) {
        if (cliente.getCpf().length() == 11) {
            return this.pessoaDAO.adicionarPessoa(cliente);
        } else {
            System.err.println("CPF Invalido");
        }
        return false;
    }
}
