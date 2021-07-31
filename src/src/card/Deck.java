package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Deck {
    private final ArrayList<Card> deck;
    private static final int DECK_TOP_CARD = 0;


    public Deck() {
        deck = new ArrayList<>();
        createDeckByPatterns();
        validateDuplicatedCard();
        Collections.shuffle(deck);
    }

    public void createDeckByPatterns() {
        for (CardPattern cardPattern : CardPattern.values()) {
            createOnePatternCardSet(cardPattern);
        }
    }

    public void createOnePatternCardSet(CardPattern cardPattern) {
        for (CardNumber cardNumber : CardNumber.values()) {
            deck.add(new Card(cardPattern, cardNumber));
        }
    }

    public Card drawCard() {
        validateIsEmptyDeck();
        return deck.remove(DECK_TOP_CARD);
    }

    private void validateIsEmptyDeck() {
        if (deck.isEmpty()) {
            throw new IllegalArgumentException("카드가 전부 사용되었습니다! 게임 종료!");
        }
    }


    private void validateDuplicatedCard() {
        Set<Card> tempDeck = new HashSet<>(deck);
        if (tempDeck.size() != deck.size()) {
            throw new IllegalArgumentException("카드가 중복되게 만들어 졌음!");
        }
    }

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card.getCardPattern() + " " + card.getNumber());
        }
    }
}
