package org.example;

public class Main {
    public static void main(String [] args)
    {
        //create 2 players with specified attributes
        Player player1= new Player("A",50,5,10);
        Player player2= new Player("B",100,10,5);

        //create arena with 2 players
        Arena arena = new Arena(player1,player2);

        //start the battle
        arena.startBattle();
    }
}
