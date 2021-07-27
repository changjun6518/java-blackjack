import java.util.Scanner;

public class Game {
    private User user;
    private User dealer;
    private final Deck deck = new Deck();

    public void start(Scanner scanner) {
        inputUser(scanner);
        firstDraw();
        printUserAndDealerCard();
        extraDraw(scanner);
        printUserAndDealerCard();
    }

    public void inputUser(Scanner scanner) {
        this.user = new User(scanner.next());
        this.dealer = new User("딜러");
    }

    public void firstDraw() {
        System.out.println("딜러와 "+user.getUserName() + "에게 카드 2장 씩을 나눴습니다");
        dealer.drawCard(deck.drawCard());
        user.drawCard(deck.drawCard());
        dealer.drawCard(deck.drawCard());
        user.drawCard(deck.drawCard());
    }

    public void printUserAndDealerCard() {
        dealer.printCards();
        user.printCards();
    }

    public void extraDraw(Scanner scanner) {
        System.out.println(user.getUserName() + "는 한장의 카드를 더 받겠습니까? (y or n)");
        String userAnswer = scanner.next();
        if (userAnswer.equals("y")) {
            user.drawCard(deck.drawCard());
        }
    }

}
