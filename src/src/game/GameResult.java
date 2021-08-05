package game;

import player.Player;
import player.Players;

import java.util.ArrayList;

public class GameResult {
    private ArrayList<Player> winners;
    private static final int LIMIT_SCORE = 21;

    public GameResult() {
        winners = new ArrayList<>();
    }

    public void decideWinnerByDealer(Player player, Player dealer) {
        if (!checkScoreLessThan21(dealer)) {
            winners.add(player);
            return;
        }
        if (player.sumCardScore() > dealer.sumCardScore()) {
            winners.add(player);
        }
    }

    public boolean checkScoreLessThan21(Player player) {
        return player.getScore() <= LIMIT_SCORE;
    }

    public void printWinner() {
        if (winners.isEmpty()) {
            System.out.println("승자가 없습니다...!");
            return;
        }
        for (Player winner : winners) {
            System.out.println("승자는 " + winner.getUserName() + " 입니다!");
        }
    }
}
