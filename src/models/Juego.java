package models;

public class Juego {
    private Jugador jug1;
    private Jugador jug2;
    private int numTiradas;

    /*
     * Método constructor, le mando los nombres de los jugadores,
     * el numero de caras de los dados de cada uno de los jugadores y
     * el número de tiradas que va a tener el juego.
     * 
     * Esto se podría mejorar mandando dos Arrays y un int,
     * Cada array tendría [String name, int numCaras] y
     * el int seguiría siendo numTiradas.
     * Así se pasarían los parámetros de forma más ordenada.
     * 
     * Prueba a hacerlo en un futuro.
     */
    public Juego(String name1, int numCaras1, String name2, int numCaras2, int numTiradas) {

        this.jug1 = new Jugador(name1);
        this.jug2 = new Jugador(name2);

        jug1.setNumCaras(numCaras1);
        jug2.setNumCaras(numCaras2);

        this.numTiradas = numTiradas;
    }

    /*
     * Para comprobar qué jugador ha ganado, como no quiero encadenar
     * sentencias else if y switch solo compara valores, aplico la siguiente lógica:
     * Si resto el valor de result1 - result2 obtengo un valor que
     * puedo switchear:
     *  - si el valor es positivo significa que result1 > result2
     *  - si el valor es negativo, result1 < result2
     *  - si el valor es 0, result1 == result2
     * Utilizo el método signum de la clase Integer que me devuelve un 1 si el
     * valor es positivo, un -1 si el valor es negativo, y un 0 si es 0
     */
    public Jugador compararResult(Jugador jug1, Jugador jug2) {
        switch (Integer.signum(jug1.getResult() - jug2.getResult())) {
            case 1: // Positivo: jug1 > jug2
                return jug1;
            case -1: // Negativo: jug1 < jug2
                return jug2;
            case 0: // Empate: jug1 == jug2
                return null;
            default:
                return null; // Este caso no debería ocurrir pero lo definimos por si a caso
        }
    }

    public Jugador getJug1() {
        return jug1;
    }

    public Jugador getJug2() {
        return jug2;
    }

    /*
     * Este método controla la dinámica de juego, lanzando los dados tantas
     * veces como tiradas se hayan definido y acumulando los resultados.
     * Luego asigna los resultados a cada jugador y compara los jugadores.
     * Devuelve un jugador ganador.
     */
    public Jugador jugar() {
        int result1 = 0;
        int result2 = 0;

        for (int i = 0; i < numTiradas; i++) {
            result1 += jug1.lanzarDado();
            result2 += jug2.lanzarDado();
        }

        jug1.setResult(result1);
        jug2.setResult(result2);

        return compararResult(jug1, jug2);
    }
}

