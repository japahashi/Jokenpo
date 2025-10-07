package br.senai.sp.jandira.ds1t.jokenpo.model;

import java.util.Random;
import java.util.Scanner;

public class JokenpoGame {

    int escolhaDoUsuario;
    int escolhaDoComputador;
    String usarioJogarNovamente;


    public void ObterDados() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Esolha uma opção");
        System.out.println("(1) Pedra");
        System.out.println("(2) Papel");
        System.out.println("(3) Tesoura");
        System.out.println("----------------------------");
        System.out.print("Digite a sua escolha: ");
        escolhaDoUsuario = leitor.nextInt();
        System.out.println("----------------------------");

        MostrarEscolhaDoUsuario();

    }

    public void MostrarEscolhaDoUsuario() {
        if (escolhaDoUsuario == 1) {
            System.out.println("Você escolheu Pedra");
        } else if (escolhaDoUsuario == 2) {
            System.out.println("Você escolheu Papel");

        } else {
            System.out.println("Você escolheu Tesoura");
        }
        GerarEscolhaDoComputador();
    }

    public void GerarEscolhaDoComputador() {
        Random gerador = new Random();
        escolhaDoComputador = gerador.nextInt(3) + 1;

        MostrarEscolhaDoComputador();
    }

    public void MostrarEscolhaDoComputador() {
        if (escolhaDoComputador == 1) {
            System.out.println("O computador escolheu Pedra");
        } else if (escolhaDoComputador == 2) {
            System.out.println("O computador escolheu Papel");

        } else {
            System.out.println("O computador escolheu Tesoura");

        }
        System.out.println("----------------------------");
        VerfificarCondicaoDoUsuario();
    }

    public void VerfificarCondicaoDoUsuario() {
        if (escolhaDoUsuario == 1 && escolhaDoComputador == 2) {
            System.out.println("*** VOCÊ PERDEU :( ***");

        } else if (escolhaDoUsuario == 1 && escolhaDoComputador == 3) {
            System.out.println("*** VOCÊ GANHOU!!! ***");

        } else if (escolhaDoUsuario == 2 && escolhaDoComputador == 1) {
            System.out.println("*** VOCÊ GANHOU!!! ***");

        } else if (escolhaDoUsuario == 2 && escolhaDoComputador == 3) {
            System.out.println("*** VOCÊ PERDEU :( ***");

        } else if (escolhaDoUsuario == 3 && escolhaDoComputador == 1) {
            System.out.println("*** VOCÊ PERDEU :( ***");

        } else if (escolhaDoUsuario == 3 && escolhaDoComputador == 2) {
            System.out.println("*** VOCÊ GANHOU!!! ***");

        } else {
            System.out.println("*** EMPATE ***");
        }
        JogarNovamente();
    }
    public void JogarNovamente(){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Jogar novamente (S/N)?");
        leitor.nextLine();
        ObterDados();

        }
    }
