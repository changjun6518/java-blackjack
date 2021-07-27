import java.util.ArrayList;

public class User {
    private final String userName;
    private final ArrayList<Card> cards = new ArrayList<>();
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

    public String getUserName() {
        return userName;
    }
}
