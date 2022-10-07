package rockpaperscissor;

import java.util.*;

public class RockPaperScissorsGame {

    private Player playerA;
    private Player playerB;

    RockPaperScissorsGame(Player playerA, Player playerB){
        this.playerA = playerA;
        this.playerB = playerB;
    }
    public void run() {

        boolean wantToPlay = true;
        while (wantToPlay) {

            RPSFist choiceA = playerA.resolveFist();
            RPSFist choiceB = playerB.resolveFist();

            // Evaluate if user won or lost against computer
            RPSResult result = choiceA.competeWith(choiceB);

            // Print result
            String playerAName = playerA.getName();
            String playerBName = playerB.getName();

            System.out.printf("%s played %s, %s played %s, it's a %s for %s!\n", playerAName, choiceA, playerBName, choiceB, result, playerAName);

            // Check if the users wants to play again
            System.out.print("Want to play again?(y/n): ");
            wantToPlay = fetchWantPlayAgain();
        }

        System.out.println("Bye!");
    }


    private boolean fetchWantPlayAgain() {
        Scanner scanner = new Scanner(System.in);
        //String yesNo = scanner.next("(?i)([yn])");
        String yesNo = scanner.next();
        return yesNo.equals("y");
    }
}
