package br.edu.fescfafic.poo.Interface;

import java.util.ArrayList;
import java.util.UUID;

public interface InterfaceDAO<T> {
    boolean inserir(T objeto);

    boolean remover(T  objeto);

    public void atualizar(int posicao, T objeto);

    ArrayList<T> listarAcoes();

    public T buscarPorID(UUID id);
}
