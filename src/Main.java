

import models.Juego;

public class Main {
    static String jugador1Nombre = "Paco";
    static String jugador2Nombre = "Pepe";
    static int numTiradas = 6;

    public static void main(String[] args) {
        Juego partidaDados = new Juego(jugador1Nombre, jugador2Nombre, numTiradas);
        String resultado = partidaDados.jugar();
        System.out.println(resultado);
    }
}