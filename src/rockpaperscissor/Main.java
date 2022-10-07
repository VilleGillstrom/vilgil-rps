package rockpaperscissor;

public class Main {

    public static void main(String[] args) {

        Player playerA = new HumanPlayer("Human", 0);
        Player playerB = new AIPlayer("AI", 0);
        RockPaperScissorsGame game = new RockPaperScissorsGame(playerA, playerB);

        game.run();
    }
}
