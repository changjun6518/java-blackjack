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

    public int getScoreByCard() {
        if (number == "A") {
            return 1;
        } else if (number == "J") {
            return 11;
        } else if (number == "Q") {
            return 12;
        } else if (number == "K") {
            return 13;
        } else {
            return Integer.parseInt(number);
        }
    }
}
