package org.example.poker;

import java.util.LinkedHashMap;
import java.util.Map;

public class Deck {
    public static void GenerateDeck (){
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        Map<String, Card> deck = new LinkedHashMap<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                String key = rank + suit.charAt(0); // e.g., "AS" for Ace of Spades
                deck.put(key, new Card(suit, rank));
            }
        }
    }
}
