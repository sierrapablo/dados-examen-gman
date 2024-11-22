package models;

import java.util.Random;

public class Jugador {
    private String name;
    private Dado dado;
    private int result;

    public Jugador(String name) {
        this.name = name;
        this.dado = new Dado();
        this.result = 0;
    }

    /*
     * Aquí he hecho estas funciones así porque realmente el número de caras
     * no debería ser un atributo de Jugador, sino un valor que le asigna
     * a su atributo Dado. Por lo tanto, un jugador asignará el valor del
     * atributo numCaras de su atributo Dado y devolverá el número de
     * caras que devuelva el valor del atributo numCaras de su atributo Dado.
     */
    public void setNumCaras(int numCaras) { // Envía el valor de numCaras hacia su atributo Dado
        this.dado.setNumCaras(numCaras);
    }

    public int getNumCaras() { // recibe el valor de numCaras de su atributo Dado
        return dado.getNumCaras();
    }

    public int lanzarDado() {
        Random random = new Random();
        return random.nextInt(dado.getNumCaras()) + 1;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public int getResult() {
        return result;
    }
    
}
