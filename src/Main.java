
import models.Juego;

public class Main {

    static String jugador1Nombre = "Paco";
    static int numCarasDado1 = 6;

    static String jugador2Nombre = "Pepe";
    static int numCarasDado2 = 6;

    static int numTiradas = 10;

    public static void main(String[] args) {
        Juego partidaDados = new Juego(
            jugador1Nombre, numCarasDado1,
            jugador2Nombre, numCarasDado2,
            numTiradas
        );

        String resultado = partidaDados.jugar();
        System.out.println(resultado);
    }
}