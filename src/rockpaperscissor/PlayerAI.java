package rockpaperscissor;

public class PlayerAI extends Player {
    public PlayerAI(String name, int score) {
        super(name, score);
    }

    @Override
    public Fist makeFist() {
        int between0and2 = ((int) (Math.random() * 3));
        switch (between0and2) {
            case 0:
                return Fist.ROCK;
            case 1:
                return Fist.PAPER;
            case 2:
                return Fist.SCISSOR;
        }
        throw new RuntimeException("Bad programmer");
    }
}
