package br.edu.fesfafic.Controller;

import br.edu.fesfafic.DAO.AcaoDAO;
import br.edu.fesfafic.Model.Acao;


import java.util.ArrayList;

public class AcaoController{
    AcaoDAO acaoDAO = new AcaoDAO();

    public boolean inserir(Acao acao) {
        if (acao.getTicker().length() == 5) {
            return this.acaoDAO.inserir(acao);
        } else {
            System.err.println("Ticker Invalido");
        }
        return false;
    }

    //Isso daqui é a logica para procurar por letras parecidas etc bom para usar em um de ações
    public ArrayList<Acao> buscarUsuarioPorNome(String procura) {
        if (procura.length() >= 2) {
            return this.acaoDAO.buscarPorAcao(procura);
        } else {
            System.err.println("Nenhum nome encotrado");
            return null;
        }
    }
}

