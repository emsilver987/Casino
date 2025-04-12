package org.example.poker;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    @BeforeEach
    void setUp() {
        Deck.resetInstance(); // Reset the singleton before each test
    }

    @Test
    void testDeckHas52UniqueCards() {
        Deck deck = Deck.getInstance();
        Set<String> drawnCards = new HashSet<>();

        for (int i = 0; i < 52; i++) {
            Card card = deck.getRandomCard();
            String key = card.getRank() + card.getSuit();
            assertFalse(drawnCards.contains(key), "Duplicate card found: " + key);
            drawnCards.add(key);
        }

        assertEquals(52, drawnCards.size(), "Expected 52 unique cards");
    }

    @Test
    void testDrawingMoreThan52ThrowsException() {
        Deck deck = Deck.getInstance();

        // Draw 52 cards first
        for (int i = 0; i < 52; i++) {
            deck.getRandomCard();
        }

        // 53rd draw should throw exception
        assertThrows(IllegalStateException.class, deck::getRandomCard, "Expected exception when drawing more than 52 cards");
    }
}
