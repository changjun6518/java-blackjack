import card.Deck;
import game.Game;
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
        game.start(scanner);
    }
}
