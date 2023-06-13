package br.edu.fescfafic.poo.Interface;

import br.edu.fescfafic.poo.Model.Acao;

import java.util.ArrayList;

public interface InterfaceAcao {

    public boolean inserir (Acao acao);
    public void buscarAcao(int posicao,Acao acao);
    public boolean remover(int posicao,Acao acao);
    ArrayList<Acao> listarAcoes();


}
