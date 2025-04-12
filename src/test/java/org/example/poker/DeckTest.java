package org.example.poker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    @Test
    void testDeckHas52UniqueCards() {
        Deck deck = Deck.getInstance();
        assertEquals(52, deck.getDeck().size());
    }
}
