package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {


    @Test
    public void testFightScenario() {

        // Create two players with initial attributes
        Player playerA = new Player("A", 50, 5, 10);
        Player playerB = new Player("B", 100, 10, 5);

        // Create an arena with the two players
        Arena arena = new Arena(playerA, playerB);

        // Start the battle
        arena.startBattle();

        // Verify that at least one player is dead after the battle
        assertTrue(playerA.getHealth() <= 0 || playerB.getHealth() <= 0);
    }

    @Test
    public void testDamageCalculation() {

        // Create two players with initial attributes
        Player playerA = new Player("A", 50, 5, 10);
        Player playerB = new Player("B", 100, 10, 5);

        // Create an arena with the two players
        Arena arena = new Arena(playerA, playerB);

        // Initial health check
        assertEquals(100, playerB.getHealth());
        assertEquals(50, playerA.getHealth());

        // Simulate a match fight where playerA attacks playerB
        arena.matchFight(playerA, playerB);

        // Ensure the health of playerB has been reduced correctly
        assertTrue(playerB.getHealth() < 100);
        assertTrue(playerB.getHealth() >= 0);
    }
}
