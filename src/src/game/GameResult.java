package game;

import player.Player;

public class GameResult {
    private Player winner;
    private static final int LIMIT_SCORE = 21;

    public GameResult(Player playerA, Player playerB) {
        if (checkScoreLessThan21(playerA) && checkScoreLessThan21(playerB)) {
            winner = decideWinner(playerA, playerB);
        } else if (checkScoreLessThan21(playerA)) {
            winner = playerA;
        } else if (checkScoreLessThan21(playerB)) {
            winner = playerB;
        }
    }

    public Player decideWinner(Player playerA, Player playerB) {
        if (playerA.sumCardScore() < playerB.sumCardScore()) {
            return winner = playerB;
        } else {
            return winner = playerA;
        }
    }

    public boolean checkScoreLessThan21(Player player) {
        return player.getScore() <= LIMIT_SCORE;
    }

    public void printWinner() {
        if (winner == null) {
            System.out.println("승자가 없습니다...!");
            return;
        }
        System.out.println("승자는 " + winner.getUserName() + " 입니다!");
    }
}
