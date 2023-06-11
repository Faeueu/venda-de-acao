package br.edu.fesfafic.Interface;

import java.util.ArrayList;
import java.util.UUID;

public interface InterfaceDAO <T>{

    public boolean inserir(T objeto);

    public boolean remover(T objeto);

    public void atualizar(int posicao, T objeto);

    public ArrayList<T> listaAcoes();

    public T buscarPorID(UUID id);
}
