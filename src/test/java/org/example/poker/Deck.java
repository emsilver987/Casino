//package org.example.poker;
//
//import java.util.*;
//
//
//public class Deck {
//    private static Deck instance;
//    private Map<String, Card> deck;
//
//    private Deck() {
//        generateDeck();
//    }
//
//    public static Deck getInstance() {
//        if (instance == null) {
//            instance = new Deck();
//        }
//        return instance;
//    }
//
//    private void generateDeck() {
//        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
//        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
//        deck = new LinkedHashMap<>();
//        for (String suit : suits) {
//            for (String rank : ranks) {
//                String key = rank + suit.charAt(0);
//                deck.put(key, new Card(suit, rank));
//            }
//        }
//    }
//
//    public Card getRandomCard() {
//        if (deck.isEmpty()) {
//            throw new IllegalStateException("No cards left in the deck!");
//        }
//        List<String> keys = new ArrayList<>(deck.keySet());
//        int index = new Random().nextInt(keys.size());
//        String cardKey = keys.get(index);
//        Card selectedCard = deck.remove(cardKey);
//        return selectedCard;
//    }
//
//
//    public Map<String, Card> getDeck() {
//        return deck;
//    }
//}
