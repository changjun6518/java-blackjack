package player;

import card.Card;

import java.util.ArrayList;
import java.util.Collections;

public class Player {
    protected final String userName;
    protected final ArrayList<Card> cards = new ArrayList<>();
    protected Integer score = 0;
    public Player(String userName) {
        this.userName = userName;
    }

    public void drawCard(Card card) {
        cards.add(card);
    }

    public void openCards() {
        System.out.print(userName + " : ");
        for (Card card : cards) {
            System.out.print(card.getCardPattern() + " " + card.getNumber() + "    ");
        }
        System.out.println();
    }

    public void printScore() {
        System.out.print(userName + " : ");
        for (Card card : cards) {
            System.out.print(card.getCardPattern() + " " + card.getNumber() + "    ");
        }
        System.out.print("결과 - " + score);
        System.out.println();
    }

    public Integer sumCardScore() {
        score = 0;
        Collections.sort(cards);

        for (Card card : cards) {
            this.score += card.getNumber(score);
        }
        return score;
    }


    public String getUserName() {
        return userName;
    }

    public Integer getScore() {
        return score;
    }
}
