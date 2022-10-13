package rockpaperscissor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerHuman extends Player {

    public PlayerHuman(String name, int score) {
        super(name, score);
    }

    @Override
    public Fist makeFist() {
        Scanner scanner = new Scanner(System.in);
        Fist userChoice = null;
        do {
            System.out.print("Rock, Paper, Scissors: ");
            try {
                String choiceAsString = scanner.next("(?i)(rock|paper|scissor)");
                userChoice = stringToChoice(choiceAsString);
            } catch (InputMismatchException e) {
                scanner.next(); // Consume invalid input
                System.out.println("You have to pick Rock, Paper or Scissor");
            }
        } while(userChoice == null);

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
