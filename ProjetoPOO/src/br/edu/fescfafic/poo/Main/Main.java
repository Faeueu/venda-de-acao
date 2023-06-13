package br.edu.fescfafic.poo.Main;

import br.edu.fescfafic.poo.DAO.CarteriaAcaoDAO;
import br.edu.fescfafic.poo.Model.Acao;
import br.edu.fescfafic.poo.Utils.Mapeamento;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {

        Acao acao1 = new Acao("engi11", "Energisa", 0.50,  250);
        Acao acao2 = new Acao("tesl4", "Tesla", 20,  25);


        CarteriaAcaoDAO carteira = new CarteriaAcaoDAO();

        carteira.inserir(acao1);
        carteira.inserir(acao2);


        ArrayList<Acao> acoes =  carteira.listarAcoes();

        System.out.println("\nPROCESSO DE ATUALIZAÇÃO\n");

        Map<String, Object> acaoMap = new HashMap<>();

        Acao acaoAtualizar = carteira.buscarPorID(acoes.get(1).getId());
        System.out.println(acaoAtualizar);
        acaoMap.put("ticker", acaoAtualizar.getTicker());
        acaoMap.put("empresa", acaoAtualizar.getNomeEmpresa());
        acaoMap.put("valor", acaoAtualizar.getPrecoUnitario());
        acaoMap.put("quantidade", acaoAtualizar.getQuantidade());


    }
}