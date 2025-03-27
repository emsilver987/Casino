package org.example.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static org.example.poker.Deck.getInstance;

public class Card {
        private String suit;
        private String rank;

        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public String getSuit() {
            return suit;
        }

        public String getRank() {
            return rank;
        }

        @Override
        public String toString() {
            return rank + " of " + suit;
        }
    }
