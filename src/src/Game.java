import java.util.Scanner;

public class Game {
    private User user;
    private User dealer;
    private final Deck deck = new Deck();

    public void start() {

    }

    public void inputUser() {
        Scanner sc = new Scanner(System.in);
        this.user = new User(sc.next());
        this.dealer = new User("딜러");
    }

    public void firstDraw() {
        dealer.addCard(deck.drawCard());
        user.addCard(deck.drawCard());
        dealer.addCard(deck.drawCard());
        user.addCard(deck.drawCard());
    }

    public void printUserAndDealerCard() {
        dealer.printCards();
        user.printCards();
    }



}
