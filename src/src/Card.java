public class Card {
    private String cardPattern;
    private String number;

    public Card(String cardPattern, String number) {
        this.cardPattern = cardPattern;
        this.number = number;
    }

    public String getCardPattern() {
        return this.cardPattern;
    }

    public String getNumber() {
        return this.number;
    }
}
