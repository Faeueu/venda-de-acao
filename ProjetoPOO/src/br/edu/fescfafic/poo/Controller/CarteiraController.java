package br.edu.fescfafic.poo.Controller;

import br.edu.fescfafic.poo.DAO.CarteriaAcaoDAO;
import br.edu.fescfafic.poo.Model.Acao;

import java.util.ArrayList;

public class CarteiraController {
    CarteriaAcaoDAO carteriaAcaoDAO = new CarteriaAcaoDAO();
    public boolean inserir(Acao acao) {
        if (acao.getTicker().length() == 5) {
            return this.carteriaAcaoDAO.inserir(acao);
        }
        return false;
    }
    public ArrayList<Acao> buscarAcaoPorTicker(String ticker){
        if (ticker.length() >= 3){
            return this.carteriaAcaoDAO.buscarAcao(ticker);
        }
        return null;
    }
    public void atualizarAcao(int posicao, Acao ticker){
        this.carteriaAcaoDAO.atualizar(posicao, ticker);
    }
    public boolean remover(Acao ticker) {
        return this.carteriaAcaoDAO.remove(ticker);
    }
}
