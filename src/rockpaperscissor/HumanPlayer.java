package rockpaperscissor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer extends Player {

    HumanPlayer(String name, int score) {
        super(name, score);
    }

    @Override
    public Fist makeFist() {
        Scanner scanner = new Scanner(System.in);
        Fist userChoice = null;
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

    private Fist stringToChoice(String choiceString) {
        switch (choiceString.toLowerCase()) {
            case "rock":
                return Fist.ROCK;
            case "paper":
                return Fist.PAPER;
            case "scissor":
                return Fist.SCISSOR;
        }
        throw new IllegalArgumentException("Must be any of rock, paper and scissor");
    }

}
