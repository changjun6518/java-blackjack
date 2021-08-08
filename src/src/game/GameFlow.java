package game;

import player.Players;

import java.util.Scanner;

public class GameFlow {
    private Game game;

    public GameFlow(Game game) {
        this.game = game;
    }

    public void start(Scanner scanner) {
        game.inputUser(scanner);
        game.firstDraw();
        game.openPlayersCard();
        game.openDealerOneCard();
        game.extraDraw(scanner);
        game.checkDealerScoreLessThanSixTeen();
        game.sumCardScore();
        game.printScore();
        game.choiceWinner();
        game.printWinner();
    }

    public void moreGame(Scanner scanner, Players players) {
        players.initializeCard();
        game.firstDraw();
        game.openPlayersCard();
        game.openDealerOneCard();
        game.extraDraw(scanner);
        game.checkDealerScoreLessThanSixTeen();
        game.sumCardScore();
        game.printScore();
        game.choiceWinner();
        game.printWinner();
    }
}
