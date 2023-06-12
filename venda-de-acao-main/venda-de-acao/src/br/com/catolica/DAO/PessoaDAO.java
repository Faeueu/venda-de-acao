package br.com.catolica.DAO;

import br.com.catolica.Interface.InterfacePessoaDAO;

import java.util.ArrayList;

public class PessoaDAO implements InterfacePessoaDAO {

    ArrayList<Object> basePessoas;

    public PessoaDAO(){}

    @Override
    public boolean adicionarPessoa(Object pessoa) {
        basePessoas.add(pessoa);
        return false;
    }


    public void buscarPessoa(int index) {
        System.out.println(basePessoas.get(index));
    }


    public void listarPessoa() {
        for (int i = 0; i < basePessoas.size(); i++) {
            System.out.println(basePessoas.get(i));
        }
    }

    @Override
    public boolean removerPessoa(int pessoas) {
        if (basePessoas.remove(pessoas) != null) {
            System.out.println("O item da posicao: " + pessoas + " foi removido.");
            return true;
        }
        return false;
    }

}
