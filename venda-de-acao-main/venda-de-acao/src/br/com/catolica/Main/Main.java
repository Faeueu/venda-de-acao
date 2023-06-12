package br.com.catolica.Main;

import br.com.catolica.Controller.AcaoController;
import br.com.catolica.Controller.ClienteController;
import br.com.catolica.DAO.AcaoDAO;
import br.com.catolica.DAO.PessoaDAO;
import br.com.catolica.Interface.InterfaceAcaoDAO;
import br.com.catolica.Model.Acao;
import br.com.catolica.Model.Cliente;
import br.com.catolica.Model.Funcionario;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        int opc = 0;
        opc = -1;
        Scanner scr = new Scanner(System.in);
        PessoaDAO pessoa = new PessoaDAO();
        AcaoDAO acaoDAO = new AcaoDAO();
        ClienteController clienteController = new ClienteController();
        AcaoController acaoController = new AcaoController();
        List<AcaoDAO> carteiraAcao = new ArrayList<>();

        Acao acao1 = new Acao("111", "Energisa", 0.50, 2);
        Acao acao2 = new Acao("222", "Tesla", 2.0, 5);
        Acao acao3 = new Acao("333", "Bradesco", 0.25, 6);

        carteiraAcao.add(acao1);
        carteiraAcao.add(acao2);
        carteiraAcao.add(acao3);

        while (opc != 0) {
            System.out.println("1- Adiconar açao");
            System.out.println("2- Buscar açao");
            System.out.println("3- Listar ações na carteira");
            System.out.println("4- Remover açao");

            System.out.print("Escolha uma opção: ");
            opc = scr.nextInt();
            scr.nextLine();

            try {

                if (opc == 1) {
                    System.out.print("Digite o ticker da ação: ");
                    String ticker = scr.nextLine();

                    System.out.print("Digite o nome da ação: ");
                    String nome = scr.nextLine();

                    System.out.print("Digite o preço medio da ação: ");
                    double precoUnitario = scr.nextDouble();

                    System.out.print("Digite a quantidade de ações: ");
                    int quantidade = scr.nextInt();

                    Acao acao = new Acao(ticker, nome, precoUnitario, quantidade);
                    carteiraAcao.add(acao);

                    System.out.println("Ação adicionada com sucesso!");

                }
                if (opc == 2) {
                    System.out.print("Digite o indicie da ação que deseja buscar: ");
                    acaoDAO.buscarAcao(scr.nextInt());
                }

                if (opc == 3) {
                    System.out.println(carteiraAcao);
                }
                if (opc == 4) {
                    System.out.print("Digite o indice da ação que deseja remove: ");
                    acaoDAO.removerAcao(scr.nextInt());
                }
            }
            catch (IndexOutOfBoundsException e ) {
                System.err.println("O índice não foi encontrado");
            }
            catch (InputMismatchException e){
                System.err.println("Somente numeros");
            }
        }
    }
}




        /*
        pessoa.adicionarPessoa("Rafael");
        pessoa.adicionarPessoa("Claudio");
        System.out.println("Adicione uma pessoa a lista: ");
        pessoa.adicionarPessoa(scr.nextLine());


        pessoa.listarPessoa();

        System.out.println("Busque uma pessoa pela posiçãp ja existente na lista: ");
        pessoa.buscarPessoa(scr.nextInt());

        System.out.println(">ATUALIZANDO LISTA DE PESSOAS<");
        System.out.println("Remova uma pessoa pela posição ja existente na lista: ");
        pessoa.removerPessoa(scr.nextInt());

        System.out.println("LISTA ATUALIZADA");
        pessoa.listarPessoa();


        AcaoDAO acao = new AcaoDAO();

        acao.adicionarAcao(acao1);
        acao.adicionarAcao(acao2);
        acao.adicionarAcao(acao3);
        acao.listarAcao();

        System.out.println(">ATUALIZANDO AÇÕES<");
        acao.removerAcao(2);
        acao.listarAcao();*/


