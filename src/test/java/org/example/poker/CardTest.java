package org.example.poker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    @Test
    void testGetSuitAndRank() {
        Card card = new Card("Hearts", "A");
        assertEquals("Hearts", card.getSuit());
        assertEquals("Ace", card.getRank());
    }

    @Test
    void testRankConversion() {
        assertEquals(14, new Card("Spades", "A").getRankIndex());
        assertEquals(13, new Card("Spades", "K").getRankIndex());
        assertEquals(12, new Card("Spades", "Q").getRankIndex());
        assertEquals(11, new Card("Spades", "J").getRankIndex());
        assertEquals(10, new Card("Spades", "10").getRankIndex());
        assertEquals(2, new Card("Spades", "2").getRankIndex());
    }

    @Test
    void testToString() {
        Card card = new Card("Diamonds", "Q");
        assertEquals("|Queen of Diamonds|", card.toString());
    }

    @Test
    void testInvalidRank() {
        Card weirdCard = new Card("Clubs", "Z");
        assertEquals(-1, weirdCard.getRankIndex());
    }
}
