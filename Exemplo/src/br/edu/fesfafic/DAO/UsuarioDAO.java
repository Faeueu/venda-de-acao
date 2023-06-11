package br.edu.fesfafic.DAO;

import br.edu.fesfafic.Model.Usuario;

import java.util.ArrayList;

public class UsuarioDAO extends DAO<Usuario>{
    public ArrayList<Usuario> buscarPorNome(String nome){
        ArrayList<Usuario> clientes = new ArrayList<>();
        for (Usuario user: this.baseDeAcoes) {
            if (user.getNome().equals(nome)){
                clientes.add(user);
            }
        }
        return clientes;
    }
}


