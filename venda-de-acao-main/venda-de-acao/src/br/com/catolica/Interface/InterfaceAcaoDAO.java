package br.com.catolica.Interface;

import java.util.ArrayList;

public interface InterfaceAcaoDAO<acao> {


    boolean adicionarAcao(acao acao);

    void buscarAcao(int index);

    boolean removerAcao(int item);

    void listarAcao();
}
