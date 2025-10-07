package br.senai.sp.jandira.ds1t.jokenpo;

import br.senai.sp.jandira.ds1t.jokenpo.model.JokenpoGame;

public class JokenpoMain {
    public static void main(String[] args) {
        JokenpoGame JokenpoGame = new JokenpoGame();

        System.out.println("----------------------------");
        System.out.println("*** Vamos Jogar Jokenpô! ***");
        System.out.println("----------------------------");

        JokenpoGame.ObterDados();
        
    }
}
