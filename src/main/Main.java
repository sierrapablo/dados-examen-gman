package main;

import models.Player;

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Pedro");
        Player player2 = new Player("Juan");

        System.out.println("Jugador 1: " + player1.getName());
        System.out.println("Jugador 2: " + player2.getName());

        int resultP1 = player1.roll();
        int resultP2 = player2.roll();

        System.out.println("Resultado tirada Jugador 1: " + resultP1);
        System.out.println("Resultado tirada Jugador 2: " + resultP2);
        
    }
}