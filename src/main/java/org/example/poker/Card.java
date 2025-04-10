package org.example.poker;


import java.util.Arrays;
import java.util.Objects;


public class Card {
        private String suit;
        private String rank;
        private String rankIndex;

        public Card(String suit, String rank) {
            this.suit = suit;
            this.rank = rank;
            this.rankIndex = rank;
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

        // This is terrible practice but I will leave while i work on other things
        public int getRankIndex() {
            if (Objects.equals(rank, "A")){
                return 14;
            }
            else if (Objects.equals(rank, "K")){
                return 13;
            }
            else if (Objects.equals(rank, "Q")){
                return 12;
            }
            else if (Objects.equals(rank, "J")){
                return 11;
            }
            else if (Objects.equals(rank, "10")){
                return 10;
            }
            else if (Objects.equals(rank, "9")){
                return 9;
            }
            else if (Objects.equals(rank, "8")){
                return 8;
            }
            else if (Objects.equals(rank, "7")){
                return 7;
            }
            else if (Objects.equals(rank, "6")){
                return 6;
            }
            else if (Objects.equals(rank, "5")){
                return 5;
            }
            else if (Objects.equals(rank, "4")){
                return 4;
            }
            else if (Objects.equals(rank, "3")){
                return 3;
            }
            else if (Objects.equals(rank, "2")){
                return 22;
            }
            return 100000;
        }

        @Override
        public String toString() {
            return "|" + rank + " of " + suit + "|";
        }
    }
