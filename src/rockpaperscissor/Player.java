package rockpaperscissor;

public abstract class Player {

    private int score;
    private final String name;

   public Player(String name, int score) {
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



    public abstract Fist makeFist() ;

}
