package game;

import card.Card;
import card.CardNumber;
import card.CardPattern;
import card.Deck;
import player.Player;
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
        Player player = new Player("chang");

        player.drawCard(new Card(CardPattern.SPADE, CardNumber.ACE));

        player.openCards();
    }


    @Test
    public void userAndDealerCardCheck() {
        String input = "chang y";
//        OutputStream out = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(out));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);


//        Scanner scanner = new Scanner(System.in);
//        Game game = new Game();
//        game.start(scanner);
    }

    @Test
    public void ENUM_TEST() {
        for (CardNumber value : CardNumber.values()) {
            System.out.println(value);
        }
        for (CardPattern value : CardPattern.values()) {
            System.out.println(value);
        }
    }
}
