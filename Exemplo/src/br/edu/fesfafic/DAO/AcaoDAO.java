package br.edu.fesfafic.DAO;

import br.edu.fesfafic.Model.Acao;
import br.edu.fesfafic.Model.Usuario;

import java.util.ArrayList;

public class AcaoDAO extends DAO<Acao> {
    public ArrayList<Acao> buscarPorAcao(String acao) {
        ArrayList<Acao> acoes = new ArrayList<>();
        for (Acao ac : this.baseDeAcoes) {
            if (ac.getNome().equals(acao)) {
                acoes.add(ac);
            }
        }
        return acoes;
    }
}
