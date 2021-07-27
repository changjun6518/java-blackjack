import org.junit.Test;

import java.io.*;
import java.util.Scanner;

public class GameTest {
    @Test
    public void deck생성잘되는지확인() {
        Deck deck = new Deck();
        deck.printDeck();
    }

    @Test
    public void deck이draw하는카드확인() {
        Deck deck = new Deck();
        Card card = deck.drawCard();
        System.out.println(card.getCardPattern() + " " + card.getNumber());
    }

    @Test
    public void user에카드저장되는지확인() {
        User user = new User("chang");

        user.drawCard(new Card("다이아몬드", "K"));
        user.drawCard(new Card("클로버", "10"));
        user.drawCard(new Card("스페이드", "A"));

        user.printCards();
    }


    @Test
    public void userAndDealerCardCheck() {
        String input = "chang y";
//        OutputStream out = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(out));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);


        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        game.start(scanner);
    }
}
