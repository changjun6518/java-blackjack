package domain;

public class Dealer extends Player {
    private static final Integer BASE_SCORE = 16;
    public Dealer(String userName) {
        super(userName);
    }

    public boolean checkScoreLessThanBaseScore() {
        return this.sumCardScore() <= BASE_SCORE;
    }
}
