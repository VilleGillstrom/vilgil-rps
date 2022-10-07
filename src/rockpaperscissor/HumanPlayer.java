package rockpaperscissor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {

    HumanPlayer(String name, int score) {
        super(name, score);
    }

    @Override
    public RPSFist resolveFist() {
        Scanner scanner = new Scanner(System.in);
        RPSFist userChoice = null;
        boolean hasValidGuess = false;
        while (!hasValidGuess) {
            System.out.print("Rock, Paper, Scissors: ");
            try {
                String choiceAsString = scanner.next("(?i)(rock|paper|scissor)");
                userChoice = stringToChoice(choiceAsString);
                hasValidGuess = true;
            } catch (InputMismatchException e) {
                scanner.next(); // Consume invalid input
                System.out.println("You have to pick Rock, Paper or Scissor");
            }
        }
        return userChoice;
    }

    private RPSFist stringToChoice(String choiceString) {
        switch (choiceString.toLowerCase()) {
            case "rock":
                return RPSFist.ROCK;
            case "paper":
                return RPSFist.PAPER;
            case "scissor":
                return RPSFist.SCISSOR;
        }
        throw new IllegalArgumentException("Must be any of rock, paper and scissor");
    }

}
