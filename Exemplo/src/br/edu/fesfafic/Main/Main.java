package br.edu.fesfafic.Main;

import br.edu.fesfafic.Controller.UsuarioController;
import br.edu.fesfafic.DAO.AcaoDAO;
import br.edu.fesfafic.Model.Acao;
import br.edu.fesfafic.Model.Usuario;
import br.edu.fesfafic.Controller.AcaoController;
import br.edu.fesfafic.DAO.UsuarioDAO;
public class Main {
    public static void main(String[] args) {

        UsuarioController usuarioController = new UsuarioController();
        Usuario usuario = new Usuario("Rivanildo","12345678492");

        usuarioController.inserir(usuario);
        System.out.println(usuario);

        AcaoController acaoController = new AcaoController();
        Acao acao = new Acao("b4403","Bradesco",40.0,3);
        System.out.println(acao);
        acaoController.inserir(acao);







    }

}