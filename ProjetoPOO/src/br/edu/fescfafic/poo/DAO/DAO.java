package br.edu.fescfafic.poo.DAO;

import br.edu.fescfafic.poo.Interface.InterfaceDAO;
import br.edu.fescfafic.poo.Interface.InterfaceVerificar;

import java.util.ArrayList;
import java.util.UUID;

public class DAO<T extends InterfaceVerificar> implements InterfaceDAO<T> {
    ArrayList<T> bancoDeDados = new ArrayList<>();

    public DAO(){}

    @Override
    public boolean inserir(T objeto) {
        return this.bancoDeDados.add(objeto);
    }
    @Override
    public boolean remover(T objeto) {
        return this.bancoDeDados.remove(objeto);
    }
    @Override
    public void atualizar(int posicao, T objeto) {
        this.bancoDeDados.set(posicao, objeto);
    }
    @Override
    public ArrayList<T> listarAcoes() {
        System.out.println(this.bancoDeDados);
        return this.bancoDeDados;
    }

    @Override
    public T buscarPorID(UUID id) {
        for (T objeto : this.bancoDeDados) {
            if (objeto.getId().equals(id)) {
                return objeto;
            }
        }
        return null;
    }

}
