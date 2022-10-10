package rockpaperscissor;

import java.util.*;

public class RockPaperScissorsGame {

    private final Player playerA;
    private final Player playerB;

    RockPaperScissorsGame(Player playerA, Player playerB){
        this.playerA = playerA;
        this.playerB = playerB;
    }
    public void run() {
        do {
            Round round = new Round(playerA, playerB);
            round.playRound();

            printRound(round);
            printScore();
        } while (userWantsToPlay());

        System.out.println("Bye!");
    }

    private void printScore() {
        System.out.printf("%s score: %s, %s score: %s\n", playerA.getName(),playerA.getScore(), playerB.getName(),playerB.getScore());
    }

    private boolean userWantsToPlay() {
        boolean wantToPlay;
        System.out.print("Want to play again?(y/n): ");
        wantToPlay = fetchWantPlayAgain();
        return wantToPlay;
    }

    private void printRound( Round round)  {
        String playerAName = round.playerA.getName();
        String playerBName = round.playerB.getName();

        Fist playerAFist = round.getPlayerAFist();
        Fist playerBFist = round.getPlayerBFist();
        RoundResult playerAResult = round.getPlayerAResult();

        System.out.printf("%s played %s, %s played %s, it's a %s for %s!\n",
                playerAName, playerAFist, playerBName, playerBFist, playerAResult, playerAName);
    }


    private boolean fetchWantPlayAgain() {
        Scanner scanner = new Scanner(System.in);
        //String yesNo = scanner.next("(?i)([yn])");
        String yesNo = scanner.next();
        return yesNo.equals("y");
    }
}
