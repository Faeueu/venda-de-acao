package br.com.catolica.Interface;

import java.util.ArrayList;

public interface InterfacePessoaDAO<T> {


    ArrayList<Object> listaPessoa = new ArrayList<>();

    boolean adicionarPessoa(Object item);

    void buscarPessoa(int index);

    boolean removerPessoa(int item);

    void listarPessoa();

}
