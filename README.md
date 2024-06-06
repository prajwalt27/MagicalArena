# Magical Arena

## Description
This project simulates a magical arena where two players engage in battles until one of them loses all their health. The game follows specific rules:
- Each player has attributes for health, strength, and attack power.
- Players take turns attacking and defending using a six-sided dice.
- The attack power of a player is multiplied by the outcome of the attacking dice roll to determine the damage dealt.
- The defender's strength value is multiplied by the outcome of the defending dice roll to calculate the damage defended.
- Damage inflicted on the defender is the difference between the damage dealt by the attacker and the damage defended.
- The game ends when one player's health reaches zero.
- The player with lower health attacks first at the start of a match.

## How to Run the Code

### Prerequisites
- Java 11 or higher
- Gradle

### Steps to Run

1. Clone the repository to your local machine.
2. Navigate to the project directory.

    ```sh
    cd MagicalArena
    ```

3. Build the project using Gradle.

    ```sh
    ./gradlew build
    ```

4. Run the main application.

    ```sh
    ./gradlew run
    ```

## Running Tests

1. To run the unit tests, execute the following command:

    ```sh
    ./gradlew test
    ```

2. Test reports can be found in `build/reports/tests/test/index.html`.

## Project Structure

- `src/main/java/org/example/` contains the main application code.
    - `Arena.java` - Manages the fight logic between two players.
    - `Player.java` - Represents a player with health, strength, and attack attributes.
    - `Main.java` - Entry point for the application.
- `src/test/java/org/example/` contains the unit tests.
    - `ArenaTest.java` - Tests for the `Arena` class.

## Implementation Details

### Arena Class
- Manages the battle between two players.
- Players attack in turns, rolling a dice to determine attack and defense values.
- Player with lower health attacks first.
- Game ends when a player's health reaches 0.

### Player Class
- Represents a player with health, strength, and attack attributes.
- Includes methods to check if a player is alive.

### Unit Tests
- `ArenaTest.java` includes tests to verify the fight logic and damage calculation.

## Notes
- This project does not use any third-party libraries except for JUnit for testing.
- Ensure you have Java and Gradle installed on your machine to run the project.

## Running Tests

The project includes unit tests to ensure the correctness of the implementation. 
These tests cover various scenarios to validate the functionality of the code.

## Test Cases

### 1.testFightScenario():
- Description: This test verifies that the battle simulation between two players results in a valid outcome.
- Steps:
  1. Create two players with specific attributes (health, strength, and attack).
  2. Initialize an instance of the `Arena` class with these players.
  3. Start the battle by calling the `startBattle()` method.
  4. Check that at least one player's health is less than or equal to 0, indicating the end of the battle.

### 2.testDamageCalculation():
- Description: This test checks the accuracy of the damage calculation during a battle.
- Steps:
  1. Create two players with specific attributes (health, strength, and attack).
  2. Initialize an instance of the `Arena` class with these players.
  3. Simulate a single match fight where one player attacks the other.
  4. Verify that the defender's health has been reduced correctly after the attack.


