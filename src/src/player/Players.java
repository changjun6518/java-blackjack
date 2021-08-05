package player;

import card.Deck;
import game.GameResult;

import java.util.ArrayList;
import java.util.Scanner;

public class Players {
    private ArrayList<Player> players;
    private GameResult gameResult;
    public Players() {
        players = new ArrayList<>();
        gameResult = new GameResult();
    }

    public void inputPlayers(Scanner scanner, int playerCount) {
        for (int i = 0; i < playerCount; i++) {
            players.add(new Player(scanner.next()));
        }
    }

    public void drawCard(Deck deck) {
        for (Player player : players) {
            player.drawCard(deck.drawCard());
        }
    }

    public void openCard() {
        for (Player player : players) {
            player.openCards();
        }
    }

    public void drawExtraCard(Scanner scanner, Deck deck) {
        for (Player player : players) {
            while (true) {
                player.openCards();

                System.out.println(player.getUserName() + "는 한장의 카드를 더 받겠습니까? (y or n)");
                String userAnswer = scanner.next();
                
                // y or n 체크 필요
                if (userAnswer.equals("n")) {
                    break;
                }
                player.drawCard(deck.drawCard());
            }
        }
    }

    public void sumCardScore() {
        for (Player player : players) {
            player.sumCardScore();
        }
    }

    public void printScore() {
        for (Player player : players) {
            player.printScore();
        }
    }

    public void choiceWinner(Dealer dealer) {
        for (Player player : players) {
            if (gameResult.checkScoreLessThan21(player)) {
                gameResult.decideWinnerByDealer(player, dealer);
            }
        }
    }

    public void printWinner() {
        gameResult.printWinner();
    }
}
