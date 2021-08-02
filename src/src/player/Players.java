package player;

import java.util.ArrayList;
import java.util.Scanner;

public class Players {
    private ArrayList<Player> players;

    public Players() {
        players = new ArrayList<>();
    }

    public void inputPlayers(Scanner scanner, int playerCount) {
        for (int i = 0; i < playerCount; i++) {
            players.add(new Player(scanner.next()));
        }
    }

}
