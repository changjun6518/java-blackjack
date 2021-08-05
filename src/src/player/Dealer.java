package player;

import card.Card;
import player.Player;

public class Dealer extends Player {
    private static final Integer BASE_SCORE = 16;
    public Dealer(String userName) {
        super(userName);
    }

    public void openCard() {
        System.out.print(userName + " : ");
        for (Card card : cards) {
            System.out.print(card.getCardPattern() + " " + card.getNumber() + "    ");
            break;
        }
        System.out.println();
    }

    public boolean checkScoreLessThanBaseScore() {
        return this.sumCardScore() <= BASE_SCORE;
    }
}
