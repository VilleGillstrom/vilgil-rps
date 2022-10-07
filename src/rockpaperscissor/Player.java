package rockpaperscissor;

public abstract class Player {

    private int score;
    private String name;
    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract RPSFist resolveFist() ;

}
