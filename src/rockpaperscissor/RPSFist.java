package rockpaperscissor;

public enum RPSFist {
    ROCK,
    PAPER,
    SCISSOR;

    public RPSResult competeWith(RPSFist choice) {
        RPSResult result;
        switch (this)
        {
            case ROCK: result = choice.equals(PAPER) ? RPSResult.LOSS : RPSResult.WIN; break;
            case PAPER: result = choice.equals(SCISSOR) ? RPSResult.LOSS : RPSResult.WIN; break;
            case SCISSOR: result = choice.equals(ROCK) ? RPSResult.LOSS : RPSResult.WIN; break;
            default: result = RPSResult.DRAW;
        }
        return result;
    }
}