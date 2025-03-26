package org.example.poker;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Deck {
    private static Deck instance;
    private Map<String, Card> deck;

    private Deck() {
        generateDeck();
    }

    public static Deck getInstance() {
        if (instance == null) {
            instance = new Deck();
        }
        return instance;
    }

    private void generateDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        deck = new LinkedHashMap<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                String key = rank + suit.charAt(0);
                deck.put(key, new Card(suit, rank));
            }
        }
    }

    public Map<String, Card> getDeck() {
        return deck;
    }

    public Card getRandomCard() {
        List<Card> cards = new ArrayList<>(deck.values());
        int key = new Random().nextInt(cards.size());
        // Make logic here to remove card from deck
        return cards.get(key);
    }

    public void removeCard(String key) {
        deck.remove(key);
    }
}
