import java.util.ArrayList;
import java.util.HashMap;

public class Deck {
    private final ArrayList<Card> deck = new ArrayList<>();

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

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card.cardPattern + " " + card.number);
        }
    }
}
