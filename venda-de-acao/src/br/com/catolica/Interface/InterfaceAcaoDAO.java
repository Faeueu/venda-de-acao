package br.com.catolica.Interface;

import java.util.ArrayList;

public interface InterfaceAcaoDAO<T> {

    ArrayList<Object> listarAcoes = new ArrayList<>();

    boolean adicionarAcao(T acao);

    void buscarAcao(int index);

    boolean removerAcao(int item);

    void listarAcao();
}
