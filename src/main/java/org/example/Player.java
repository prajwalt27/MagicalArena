package org.example;

public class Player {
    String name;
    int health;
    int strength;
    int attack;

    //Constructor to initialize player's attributes
    public Player(String name, int health, int strength, int attack) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    //to return the health of current player
    public int getHealth() {
        return health;
    }

    //method to check player is still alive
    boolean isAlive()
    {
        return this.health>0;
    }

    //overriding tostring method to check the player's status
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                ", attack=" + attack +
                '}';
    }
}
