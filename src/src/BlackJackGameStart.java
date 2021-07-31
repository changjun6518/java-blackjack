import game.Game;

import java.util.Scanner;

public class BlackJackGameStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        game.start(scanner);
    }
}
