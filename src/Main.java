
import models.Juego;
import models.Jugador;

public class Main {

    // Jugador 1, Nombre y número de caras de su dado.
    static String jugador1Nombre = "Paco";
    static int numCarasDado1 = 6;

    // Jugador 2, Nombre y número de caras de su dado.
    static String jugador2Nombre = "Pepe";
    static int numCarasDado2 = 6;

    // Número de tiradas durante la partida
    static int numTiradas = 10;
    
        public static void main(String[] args) {
            String mensajeFinal; // Inicializamos el mensaje final

            System.out.println("Preparando la partida...");
            // Creamos la partida con las variables definidas anteriormente
            Juego partidaDados = new Juego(
                jugador1Nombre, numCarasDado1,
                jugador2Nombre, numCarasDado2,
                numTiradas
            );

            // Comprobamos el estado de la partida. Así vemos cómo se comportan los atributos de los distintos objetos.
            System.out.println("Partida lista para empezar:");
            /*
             * Vamos a llamar al método de getJug1 y getJug2 de la clase Juego
             * a través de la instancia partidaDados. Como queremos
             * saber el nombre y el número de tiradas que van a realizar,
             * llamamos al método getName y getNumCaras a partir de las
             * instancias Jugador que nos devuelven los métodos getJug1 y
             * getJug2 de partidaDados.
             */
            System.out.println(
                "El jugador 1 es " + partidaDados.getJug1().getName() + // Obtenemos el atributo de un objeto que a su vez es el atributo de otro objeto
                " y tirará un dado de " + partidaDados.getJug1().getNumCaras() + " caras." // Lo mismo
            );

            // Aquí lo hacemos para el jugador 2
            System.out.println(
                "El jugador 2 es " + partidaDados.getJug2().getName() +
                " y tirará un dado de " + partidaDados.getJug2().getNumCaras() + " caras."
            );

            // Comienza la partida
            System.out.println("¡Comienza la partida!");

            /*
             * Invocamos el método que define las reglas de la partida,
             * y nos devolverá una instancia de la clase Jugador.
             */
            Jugador ganador = partidaDados.jugar();

            System.out.println("¡Tiradas completadas!");
            
            /* Montamos el mensaje de final de partida
             * Debemos comprobar si ha habido ganador o la partida acabó en empate.
             * Si la instancia ganador no es nula, es que hay un ganador; pero
             * por el contrario, si es null, significa que ha habido un empate.
             */
            if (ganador != null) {
                mensajeFinal = (
                    "El jugador " + ganador.getName() +
                    " ha ganado con una puntuación de " + ganador.getResult() +
                    " en " + numTiradas + " tiradas."
                );
            } else {
                mensajeFinal = ("El juego ha terminado en empate.");
            }

        // Mostramos el resultado final de la partida
        System.out.println(mensajeFinal);
    }
}