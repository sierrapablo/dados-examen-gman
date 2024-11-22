package models;

public class Juego {
    private Jugador jug1;
    private Jugador jug2;
    private int numTiradas;
    private String mensajeFinal = "El juego no ha acabado.";

    public Juego(
        String name1, int numCaras1,
        String name2, int numCaras2,
        int numTiradas
    ) {
        this.jug1 = new Jugador(name1);
        this.jug2 = new Jugador(name2);
        this.numTiradas = numTiradas;

        jug1.setNumCaras(numCaras1);
        jug2.setNumCaras(numCaras2);
    }

    public Jugador compararResult(Jugador jug1, Jugador jug2) {
        switch (Integer.signum(jug1.getResult() - jug2.getResult())) {
            case 1: // Positivo: jug1 > jug2
                return jug1;
            case -1: // Negativo: jug1 < jug2
                return jug2;
            case 0: // Empate: jug1 == jug2
                return null;
            default:
                return null; // Este caso no debería ocurrir
        }
    }

    public Jugador getJug1() {
        return jug1;
    }

    public Jugador getJug2() {
        return jug2;
    }

    public Jugador jugar() {
        int result1 = 0;
        int result2 = 0;

        for (int i = 0; i < numTiradas; i++) {
            result1 += jug1.lanzarDado();
            result2 += jug2.lanzarDado();
        }

        jug1.setResult(result1);
        jug2.setResult(result2);

        Jugador ganador = compararResult(jug1, jug2);

        return ganador;
    }
}

