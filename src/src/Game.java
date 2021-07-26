import java.util.Scanner;

public class Game {
    private User user;
    private User dealer;
    private Deck deck = new Deck();
    public void start() {

    }

    public void inputUser() {
        Scanner sc = new Scanner(System.in);
        this.user = new User(sc.next());
        this.dealer = new User("딜러");
    }

    public void drawCard() {
        Card card = deck.drawCard();
        user.addCard(card);
        Card card1 = deck.drawCard();
        dealer.addCard(card);
    }

}
