package rockpaperscissor;


public enum Fist {

    NONE,
    ROCK,
    PAPER,
    SCISSOR;

    public RoundResult resultAgainst(Fist choice) {
        RoundResult result;
        if(this == NONE || choice == NONE) {
            return RoundResult.INVALID;
        }
        if(this == choice) {
            return RoundResult.DRAW;
        }

        switch (this)
        {
            case ROCK: result = choice.equals(PAPER) ? RoundResult.LOSS : RoundResult.WIN; break;
            case PAPER: result = choice.equals(SCISSOR) ? RoundResult.LOSS : RoundResult.WIN; break;
            case SCISSOR: result = choice.equals(ROCK) ? RoundResult.LOSS : RoundResult.WIN; break;
            default: result = RoundResult.INVALID; // should NEVER get here
        }
        return result;
    }
}