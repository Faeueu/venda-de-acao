package br.com.catolica.DAO;

import br.com.catolica.Interface.InterfaceAcaoDAO;
import br.com.catolica.Model.Acao;

import java.util.ArrayList;

public class AcaoDAO implements InterfaceAcaoDAO {

    ArrayList<Acao> carteiraAcao = new ArrayList<>();

    public AcaoDAO() {
        carteiraAcao = new ArrayList<>();
    }

    @Override
    public boolean adicionarAcao(Object acao) {
        listarAcoes.add(acao);
        return false;
    }


    public void buscarAcao(int index) {
        System.out.println(listarAcoes.get(index));
    }


    public void listarAcao() {
        for (Acao acao : carteiraAcao){
            System.out.println(carteiraAcao);
        }
    }

    @Override
    public boolean removerAcao(int acoes) {
        if (listarAcoes.remove(acoes) != null) {
            System.out.println("O item da posicao: " + acoes + " foi removido.");
            return true;
        }
        return false;
    }

}
