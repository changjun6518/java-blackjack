package card;

public enum CardPattern {
    SPADE("스페이드"),
    HEART("하트"),
    DIAMOND("다이아몬드"),
    CLUB("클로버");

    public String cardPattern;

    CardPattern(String cardPattern) {
        this.cardPattern = cardPattern;
    }
}
