package card;

public class Card {
    private CardPattern cardPattern;
    private CardNumber number;

    public Card(CardPattern cardPattern, CardNumber number) {
        this.cardPattern = cardPattern;
        this.number = number;
    }

    public String getCardPattern() {
        return this.cardPattern.cardPattern;
    }

    public CardNumber getNumber() {
        return this.number;
    }

    public int getCardNumber() {
        return number.getCardNumber();
    }
}
