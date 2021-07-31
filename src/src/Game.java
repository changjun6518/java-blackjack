import player.Dealer;
import card.Deck;
import card.GameResult;
import player.Player;

import java.util.Scanner;

public class Game {
    private Player player;
    private Dealer dealer;
    private final Deck deck = new Deck();

    public void start(Scanner scanner) {
        inputUser(scanner);
        firstDraw();
        printUserAndDealerCard();
        extraDraw(scanner);
        printUserAndDealerCard();
        checkDealerScoreLessThanSixTeen();
        sumCardScore();
        printScore();
        printWinner();
    }

    public void inputUser(Scanner scanner) {
        System.out.println("player 이름을 입력하세요");
        this.player = new Player(scanner.next());
        this.dealer = new Dealer("딜러");
    }

    public void firstDraw() {
        System.out.println("딜러와 "+ player.getUserName() + "에게 카드 2장 씩을 나눴습니다");
        dealer.drawCard(deck.drawCard());
        player.drawCard(deck.drawCard());
        dealer.drawCard(deck.drawCard());
        player.drawCard(deck.drawCard());
    }

    public void printUserAndDealerCard() {
        dealer.printCards();
        player.printCards();
    }

    public void extraDraw(Scanner scanner) {
        System.out.println(player.getUserName() + "는 한장의 카드를 더 받겠습니까? (y or n)");
        String userAnswer = scanner.next();
        if (userAnswer.equals("y")) {
            player.drawCard(deck.drawCard());
        }
    }

    public void checkDealerScoreLessThanSixTeen() {
        if (dealer.checkScoreLessThanBaseScore()) {
            System.out.println("딜러의 점수 합산이 16점이하라 한장의 카드를 더 받습니다");
            dealer.drawCard(deck.drawCard());
        }
    }

    public void sumCardScore() {
        dealer.sumCardScore();
        player.sumCardScore();
    }


    public void printScore() {
        dealer.printScore();
        player.printScore();
    }

    public void printWinner() {
        GameResult gameResult = new GameResult(dealer, player);
        gameResult.printWinner();
    }
}
