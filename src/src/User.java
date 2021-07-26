import java.util.ArrayList;

public class User {
    private String userName;
    private ArrayList<Card> cards = new ArrayList<>();
    public User(String userName) {
        this.userName = userName;
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void printCards() {
        for (Card card : cards) {
            System.out.println(card.getCardPattern() + " " + card.getNumber());
        }
    }
}
