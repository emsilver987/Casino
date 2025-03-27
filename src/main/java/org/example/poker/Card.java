package org.example.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import static org.example.poker.Deck.getInstance;

public class Card {
        private String suit;
        private String rank;

        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
            if (Objects.equals(rank, "A")){
                this.rank = "Ace";
            }
            if (Objects.equals(rank, "K")){
                this.rank = "King";
            }
            if (Objects.equals(rank, "Q")){
                this.rank = "Queen";
            }
            if (Objects.equals(rank, "J")){
                this.rank = "Jack";
            }
        }

        public String getSuit() {
            return suit;
        }

        public String getRank() {
            return rank;
        }

        @Override
        public String toString() {
            return "|" + rank + " of " + suit + "|";
        }
    }
