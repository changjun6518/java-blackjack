package game;

import player.Dealer;
import card.Deck;
import player.Players;

import java.util.Scanner;

public class Game {
    private Dealer dealer;
    private final Players players;
    private final Deck deck;
    private static final int PLAYER_COUNT = 6;
    public Game(Players players, Deck deck) {
        this.players = players;
        this.deck = deck;
    }

    public void inputUser(Scanner scanner) {
        int playerCount;
        while (true) {
            System.out.println("player 인원 수를 입력하세요");
            playerCount = scanner.nextInt();
            if (checkPlayerCount(playerCount)) {
                break;
            }
        }

        System.out.println("player의 이름을 입력하세요");
        players.inputPlayers(scanner, playerCount);

        this.dealer = new Dealer("딜러");
    }

    private boolean checkPlayerCount(int playerCount) {
        if (playerCount > PLAYER_COUNT) {
            System.out.println("플레이어는 최대 6명까지 입니다!");
            return false;
        }
        return true;
    }

    public void firstDraw() {
        System.out.println("딜러와 player 들에게 카드 2장 씩을 나눴습니다");
        players.drawCard(deck);
        players.drawCard(deck);
        dealer.drawCard(deck.drawCard());
        dealer.drawCard(deck.drawCard());

    }

    public void openPlayersCard() {
        System.out.println("카드를 오픈합니다");
        players.openCard();
    }

    public void openDealerOneCard() {
        System.out.println("딜러의 카드 한장 오픈합니다");
        dealer.openCard();
    }

    public void extraDraw(Scanner scanner) {
        players.drawExtraCard(scanner, deck);
    }

    public void checkDealerScoreLessThanSixTeen() {
        while (dealer.checkScoreLessThanBaseScore()) {
            System.out.println("딜러의 점수 합산이 16점이하라 한장의 카드를 더 받습니다");
            dealer.drawCard(deck.drawCard());
            dealer.openCards();
        }
    }

    public void sumCardScore() {
        dealer.sumCardScore();
        players.sumCardScore();
    }


    public void printScore() {
        System.out.println("딜러와 플레이어들의 점수!");
        dealer.printScore();
        players.printScore();
    }

    public void choiceWinner() {
        players.choiceWinner(dealer);
    }

    public void printWinner() {
        players.printWinner();
    }
}
