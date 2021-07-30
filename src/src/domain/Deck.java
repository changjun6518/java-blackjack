package domain;

import domain.Card;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    private final ArrayList<Card> deck = new ArrayList<>();
    private ArrayList<Integer> duplicatedNumber = new ArrayList<>();
    private static final Integer CARD_MIN_NUMBER = 1;
    private static final Integer CARD_MAX_NUMBER = 10;
    public Deck() {
        createDeck();
    }

    public void createDeck() {
        createOnePatternCardSet("다이아몬드");
        createOnePatternCardSet("하트");
        createOnePatternCardSet("스페이드");
        createOnePatternCardSet("클로버");
    }

    public void createOnePatternCardSet(String pattern) {
        deck.add(new Card(pattern, "A"));
        for (int i = 2; i < 11; i++) {
            deck.add(new Card(pattern, String.valueOf(i)));
        }
        deck.add(new Card(pattern, "J"));
        deck.add(new Card(pattern, "Q"));
        deck.add(new Card(pattern, "K"));
    }

    public Card drawCard() {
        int randomNum = ThreadLocalRandom.current().nextInt(CARD_MIN_NUMBER, CARD_MAX_NUMBER) + CARD_MIN_NUMBER;
        while (duplicatedNumber.contains(randomNum)) {
            randomNum = ThreadLocalRandom.current().nextInt(CARD_MIN_NUMBER, CARD_MAX_NUMBER) + CARD_MIN_NUMBER;
        }
        duplicatedNumber.add(randomNum);
        // 중복 검증 필요
        return deck.get(randomNum);
    }


    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card.getCardPattern() + " " + card.getNumber());
        }
    }
}
