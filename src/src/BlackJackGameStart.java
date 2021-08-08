import card.Deck;
import game.Game;
import game.GameFlow;
import game.GameResult;
import player.Players;

import java.util.Scanner;



public class BlackJackGameStart {

    // 객체 초기화/ 의존 처리/ 실행

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameResult gameResult = new GameResult();
        Players players = new Players(gameResult);
        Deck deck = new Deck();
        Game game = new Game(players, deck);
        GameFlow gameFlow = new GameFlow(game);


        gameFlow.start(scanner);

        while (true) {
            System.out.println("게임을 계속 진행하시겠습니까? y or n");
            String userAnswer = scanner.next();
            if (userAnswer.equals("n")) {
                break;
            }
            gameFlow.moreGame(scanner, players);
        }
    }
}
