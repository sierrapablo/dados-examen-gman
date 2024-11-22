package models;

import java.util.Random;

public class Jugador {
    private String name;
    private int numCaras;
    private Dado dado;
    private int result;

    public Jugador(String name) {
        this.name = name;
        this.dado = new Dado();
        this.result = 0;
    }
    
    public void setNumCaras(int numCaras) {
        this.dado.setNumCaras(numCaras);
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

    public int getNumCaras() {
        return numCaras;
    }
}
