package player;

import card.Deck;
import game.GameResult;

import java.util.ArrayList;
import java.util.Scanner;

public class Players {
    private final ArrayList<Player> players;
    private final GameResult gameResult;
    public Players(GameResult gameResult) {
        players = new ArrayList<>();
        this.gameResult = gameResult;
    }

    public void inputPlayers(Scanner scanner, int playerCount) {
        int check = 0;
        while (check < playerCount) {
            String userName = scanner.next();
            if (!checkPlayerNameDuplicate(userName)) {
                continue;
            }
            players.add(new Player(userName));
            check++;
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
                if (!checkYesNo(userAnswer)) {
                    continue;
                }
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

    public void initializeCard() {
        for (Player player : players) {
            player.initializeCard();
        }
    }

    private boolean checkYesNo(String userAnswer) {
        //            throw new IllegalArgumentException("y 또는 n 을 입력하세요!");
        if (!userAnswer.equals("y") && !userAnswer.equals("n")) {
            System.out.println("y or n 으로 입력해주세요!");
            return false;
        }
        return true;
    }

    private boolean checkPlayerNameDuplicate(String userName) {
        for (Player player : players) {
            if (player.userName.equals(userName)) {
                System.out.println("이름이 중복되었습니다! 다시입력해주세요!");
                return false;
            }
        }
        return true;
    }
}
