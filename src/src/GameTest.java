import org.junit.Test;

public class GameTest {
    @Test
    public void deck생성잘되는지확인() {
        Deck deck = new Deck();
        deck.printDeck();
    }
}
