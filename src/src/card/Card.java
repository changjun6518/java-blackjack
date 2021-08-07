package card;

public class Card implements Comparable<Card>{
    private CardPattern cardPattern;
    private CardNumber number;
    private static final int ACE_UPPER_POINT = 11;

    public Card(CardPattern cardPattern, CardNumber number) {
        this.cardPattern = cardPattern;
        this.number = number;
    }

    public String getCardPattern() {
        return this.cardPattern.cardPattern;
    }

    public int getNumber() {
        return number.cardNumber;
    }

    public int getNumber(int score) {
        if (isAvailableAceUpperPoint(score)) {
            return ACE_UPPER_POINT;
        }
        return number.cardNumber;
    }

    private boolean isAvailableAceUpperPoint(int score) {
        return isAce() && score <= ACE_UPPER_POINT;
    }

    public boolean isAce() {
        return number == CardNumber.ACE;
    }

    @Override
    public int compareTo(Card o) {
        return o.number.cardNumber - this.number.cardNumber;
    }
}
