package br.edu.fescfafic.poo.DAO;
import br.edu.fescfafic.poo.Model.Acao;

import java.util.ArrayList;

public class CarteriaAcaoDAO extends DAO<Acao>{
    public CarteriaAcaoDAO() {
    }
    public ArrayList<Acao> buscarAcao(String ticker){
        ArrayList<Acao> acaos = new ArrayList<>();
        for (Acao ac: this.bancoDeDados) {
            if (ac.getTicker().equals(ticker)){
                acaos.add(ac);
            }
        }
        return acaos;
    }
    public boolean remove(Acao ticker) {
        return this.bancoDeDados.remove(ticker);
    }
}
