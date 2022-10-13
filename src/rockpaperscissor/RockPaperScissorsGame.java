package rockpaperscissor;

import java.util.*;

public class RockPaperScissorsGame {

    private final Player playerA;
    private final Player playerB;

    // When either player rach this score, end the game
    private final int endAtScore;

    public RockPaperScissorsGame(Player playerA, Player playerB, int firstToScore) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.endAtScore = firstToScore;
    }
    public void run() {
        do {
            Round round = new Round(playerA, playerB);
            round.playRound();

            printRound(round);
            printScore();

        } while (!hasReachedEndScore() && userWantsToPlay());
        printEndResult();
        System.out.println("Bye!");
    }

    private void printEndResult() {
        if(playerA.getScore() == playerB.getScore()) {
            System.out.println("Game ends in a draw!");
        } else if(playerA.getScore() > playerB.getScore()) {
            System.out.printf("%s wins with a score of %s\n", playerA.getName(), playerA.getScore());
        } else {
            System.out.printf("%s wins with a score of %s\n", playerB.getName(), playerB.getScore());
        }
    }

    private boolean hasReachedEndScore() {
        return (playerA.getScore() == endAtScore) || (playerB.getScore() == endAtScore);
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
