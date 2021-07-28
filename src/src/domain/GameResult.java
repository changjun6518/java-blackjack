package domain;

public class GameResult {
    private Player winner;

    public GameResult(Player playerA, Player playerB) {
        winner = decideWinner(playerA, playerB);
    }

    private Player decideWinner(Player playerA, Player playerB) {
        if (playerA.sumCardScore() < playerB.sumCardScore()) {
            return winner = playerB;
        } else {
            return winner = playerA;
        }
    }

    public void printWinner() {
        System.out.println("승자는 " + winner.getUserName() + " 입니다!");
    }
}
