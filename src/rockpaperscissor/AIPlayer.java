package rockpaperscissor;

public class AIPlayer extends Player {
    AIPlayer(String name, int score) {
        super(name, score);
    }

    @Override
    public RPSFist resolveFist() {
        int between0and2 = ((int) (Math.random() * 3));
        switch (between0and2) {
            case 0:
                return RPSFist.ROCK;
            case 1:
                return RPSFist.PAPER;
            case 2:
                return RPSFist.SCISSOR;
        }
        throw new RuntimeException("Bad programmer");
    }
}
