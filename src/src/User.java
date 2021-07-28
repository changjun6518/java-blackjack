import java.util.ArrayList;

public class User {
    private final String userName;
    private final ArrayList<Card> cards = new ArrayList<>();
    private Integer score = 0;
    public User(String userName) {
        this.userName = userName;
    }

    public void drawCard(Card card) {
        cards.add(card);
    }

    public void printCards() {
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



    public void sumCardScore() {
        for (Card card : cards) {
            this.score += card.getScoreByCard();
        }
    }


    public String getUserName() {
        return userName;
    }
}
