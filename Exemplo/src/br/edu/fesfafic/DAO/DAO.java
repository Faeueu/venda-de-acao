package br.edu.fesfafic.DAO;

import br.edu.fesfafic.Interface.InterfaceDAO;
import br.edu.fesfafic.Interface.InterfaceIdentificadora;

import java.util.ArrayList;
import java.util.UUID;

public class DAO<T extends InterfaceIdentificadora> implements InterfaceDAO<T> {

    public ArrayList<T> baseDeAcoes = new ArrayList<>();

    @Override
    public boolean inserir(T objeto) {
        return this.baseDeAcoes.add(objeto);
    }

    @Override
    public boolean remover(T objeto) {
        return this.baseDeAcoes.remove(objeto);
    }

    @Override
    public void atualizar(int posicao, T objeto) {
        this.baseDeAcoes.set(posicao, objeto);

    }

    @Override
    public ArrayList<T> listaAcoes() {
        System.out.println(this.baseDeAcoes);
        return this.baseDeAcoes;
    }

    @Override
    public T buscarPorID(UUID id) {
        for (T objeto : this.baseDeAcoes) {
            if (objeto.getId().equals(id)) {
                return objeto;
            }
        }
        return null;
    }
}
