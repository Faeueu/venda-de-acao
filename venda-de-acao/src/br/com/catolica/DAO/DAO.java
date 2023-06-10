package br.com.catolica.DAO;

import br.com.catolica.Interface.InterfaceDAO;
import br.com.catolica.Interface.VerifiPessoa;

import java.util.ArrayList;
import java.util.UUID;

public class DAO<T extends VerifiPessoa> implements InterfaceDAO<T> {

    ArrayList<T> pessoas = new ArrayList<>();

    public DAO(){}

    public boolean inserir(T pessoa){
        return pessoas.add(pessoa);
    }

    public T buscar(UUID idPessoa){

        for (T pessoa : pessoas){
            if (pessoa.getId().equals(idPessoa)){
                return pessoa;
            }
        }
        return null;
    }

    public ArrayList<T> listar(){
        for (T pessoa : this.pessoas){
            System.out.println(pessoa);
        }
        return pessoas;
    }


    public boolean remover(UUID idPessoa){
        T pessoa = this.buscar(idPessoa);
        return pessoas.remove(pessoa);
    }

}
