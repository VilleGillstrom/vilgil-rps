package rockpaperscissor;

public class Round {

    final Player playerA;
    final Player playerB;

    private Fist fistA;
    private Fist fistB;

    Round(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
    }

    void playRound()
    {
        makeFists();
        resolveScore();
    }

    private void resolveScore() {
        Player winner = getWinner();
        if(winner != null) {
            winner.setScore(winner.getScore() + 1);
        }
    }

    private void makeFists() {
        fistA = playerA.makeFist();
        fistB = playerB.makeFist();
    }

    Player getWinner() {
        Player winner = null;
        if(!(fistA.equals(Fist.NONE) || fistB.equals(Fist.NONE))) {
            if(getPlayerAResult().equals(RoundResult.WIN)) {
                winner = playerA;
            } else if(getPlayerBResult().equals(RoundResult.WIN)) {
                winner = playerB;
            }
        }

        return winner;
    }

    public Fist getPlayerAFist() {
        return fistA;
    }

    public Fist getPlayerBFist() {
        return fistB;
    }

    public RoundResult getPlayerAResult() {
        return fistA.resultAgainst(fistB);
    }


    public RoundResult getPlayerBResult() {
        return fistB.resultAgainst(fistA);
    }
}
