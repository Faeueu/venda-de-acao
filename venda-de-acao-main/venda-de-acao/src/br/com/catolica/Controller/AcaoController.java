package br.com.catolica.Controller;

import br.com.catolica.DAO.AcaoDAO;
import br.com.catolica.DAO.AcaoDAO;
import br.com.catolica.Model.Acao;

public class AcaoController extends AcaoDAO {
    AcaoDAO acaoDAO = new AcaoDAO();

    public boolean addAcao(Acao acao) {
        if (acao.getTicker().length() == 5) {
            return this.acaoDAO.adicionarAcao(acao);
        } else {
            System.err.println("Ticker Invalido");
        }
        return false;
    }

}


