package models;

import services.Dice;


public class Player {
    
    private String name;
    private Dice dice;

    public Player(String name){
        this.name = name;
        this.dice = new Dice();
    }

    public String getName() {
        return name;
    }

    public int roll() {
        return (int) (Math.random() * dice.getFaces()) + 1;
    }
}
