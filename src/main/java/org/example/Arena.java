package org.example;

import java.util.Random;

public class Arena {
    private static final Random random = new Random();
    Player player1;
    Player player2;

    // constructor to initialize 2 players
    Arena(Player player1, Player player2)
    {
        this.player1=player1;
        this.player2=player2;
    }

    //method for rolling 6-sided dice
    private static int rollTheDice()
    {
        return random.nextInt(6)+1;
    }

    //method for fight between 2 players
    void matchFight(Player attacker, Player defender)
    {
        //rolling dice for attacker and defender
        int attackRoll =  rollTheDice();
        int defenceRoll = rollTheDice();

        //damage and strength calculation
        int damageByAttack = attacker.attack*attackRoll;
        int strengthOfDefender = defender.strength*defenceRoll;

        //calculation of actual damage taken by defender
        int damageTaken = Math.max(0,damageByAttack-strengthOfDefender);
        defender.health=defender.health-damageTaken;

        //displaying the details
        System.out.println("****--Welcome to Magical Arena!--****");
        System.out.println("Attacker Rolls: "+attackRoll);
        System.out.println("Defence Rolls: "+defenceRoll);
        System.out.println("Damage By Attack: "+damageByAttack);
        System.out.println("Defence Strength: "+strengthOfDefender);
        System.out.println(defender.name + "'s health reduced by: " + damageTaken + " to " + defender.health);
    }

    //method to start battle between two players
    public void startBattle()
    {
        //Loop until one of the player's health will drop to 0 or below it
        while(player1.isAlive() && player2.isAlive())
        {
            //player with low health attacks first
            if(player1.health<=player2.health)
            {
                //fight
                matchFight(player1,player2);

                //check if player2(defender) is dead
                if(!player2.isAlive())
                {
                    System.out.println(player1.name+" wins!");
                    break;
                }
                //fight
                matchFight(player2,player1);

                //check if player1(defender) id dead
                if(!player1.isAlive())
                {
                    System.out.println(player2.name+" wins!");
                    break;
                }
            }
            else{
                //fight
                matchFight(player2,player1);

                //check if player1(defender) is dead
                if(!player1.isAlive())
                {
                    System.out.println(player2.name+" wins!");
                    break;
                }

                //fight
                matchFight(player1,player2);

                //check if player2(defender) is dead
                if(!player2.isAlive())
                {
                    System.out.println(player1.name+" wins!");
                    break;
                }
            }
        }
    }

}
