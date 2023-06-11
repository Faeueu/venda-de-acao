package br.edu.fesfafic.Controller;


import br.edu.fesfafic.DAO.UsuarioDAO;
import br.edu.fesfafic.Model.Usuario;

import java.util.ArrayList;

public class UsuarioController {

    UsuarioDAO usuarioDAO = new UsuarioDAO();

    public boolean inserir(Usuario usuario) {
        if (usuario.getCpf().length() == 11) {
            return this.usuarioDAO.inserir(usuario);
        } else {
            System.err.println("CPF Invalido");
        }
        return false;
    }



    //Isso daqui é a logica para procurar por letras parecidas etc bom para usar em um de ações
    public ArrayList<Usuario> buscarUsuarioPorNome(String procura) {
        if (procura.length() >= 2) {
            return this.usuarioDAO.buscarPorNome(procura);
        } else {
            System.err.println("Nenhum nome encotrado");
            return null;
        }
    }
}
