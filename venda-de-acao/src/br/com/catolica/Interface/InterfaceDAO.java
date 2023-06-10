package br.com.catolica.Interface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

public interface InterfaceDAO<T> {


    boolean inserir(T pessoa);

    ArrayList<T> listar();

    T buscar (UUID pessoa);

    boolean remover(UUID pessoa);

}
