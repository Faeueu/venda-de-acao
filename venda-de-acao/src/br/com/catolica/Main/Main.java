package br.com.catolica.Main;


import br.com.catolica.DAO.AcaoDAO;
import br.com.catolica.DAO.PessoaDAO;
import br.com.catolica.Model.Acao;
import br.com.catolica.Model.Cliente;
import br.com.catolica.Model.Funcionario;

import java.util.*;



public class Main {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        PessoaDAO pessoa = new PessoaDAO();
        AcaoDAO acaoDAO = new AcaoDAO();

        List<Acao> carteiraDeAcoes = new ArrayList<>();


        int opc = -1;


        /*Acao acao1 = new Acao("Engi11", "Energisa", 0.50, 2);
        Acao acao2 = new Acao("tsl4", "Tesla", 2.0, 5);
        Acao acao3 = new Acao("br21", "Bradesco", 0.25, 6);

        carteiraDeAcoes.add(acao1);
        carteiraDeAcoes.add(acao2);
        carteiraDeAcoes.add(acao3);*/

        while (opc != 0){
            System.out.println("1- Adiconar açao");
            System.out.println("2- Buscar açao");
            System.out.println("3- Listar ações na carteira");
            System.out.println("4- Remover açao");

            System.out.print("Escolha uma opção: ");
            opc = scr.nextInt();
            scr.nextLine();

            if (opc == 1){
                System.out.print("Digite o ticker da ação: ");
                String ticker = scr.nextLine();

                System.out.print("Digite o nome da ação: ");
                String nome = scr.nextLine();

                System.out.print("Digite o preço medio da ação: ");
                double precoUnitario = scr.nextDouble();

                System.out.print("Digite a quantidade de ações: ");
                int quantidade = scr.nextInt();

                Acao acao = new Acao(ticker, nome, precoUnitario, quantidade);
                carteiraDeAcoes.add(acao);

                System.out.println("Ação adicionada com sucesso!");
            } else if (opc == 2) {

                System.out.print("Digite o indicie da ação que deseja buscar: ");
                acaoDAO.buscarAcao(scr.nextInt());

            } else if (opc == 3) {

                acaoDAO.listarAcao();

            } else if (opc == 4) {
                System.out.print("Digite o indice da ação que deseja remove: ");
                acaoDAO.removerAcao(scr.nextInt());
            }

        }




    }

}

