package org.example.poker;


import java.util.Arrays;
import java.util.Objects;


public class Card {
        private String suit;
        private String rank;

        public Card(String suit, String rank) {
            this.suit = suit;
            if (Objects.equals(rank, "A")){
                this.rank = "Ace";
            }
            else if (Objects.equals(rank, "K")){
                this.rank = "King";
            }
            else if (Objects.equals(rank, "Q")){
                this.rank = "Queen";
            }
            else if (Objects.equals(rank, "J")){
                this.rank = "Jack";
            }
            else{
                this.rank = rank;
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
            if (Objects.equals(rank, "Ace")){
                return 14;
            }
            else if (Objects.equals(rank, "King")){
                return 13;
            }
            else if (Objects.equals(rank, "Queen")){
                return 12;
            }
            else if (Objects.equals(rank, "Jack")){
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
                return 2;
            }
            return -1;
        }

        @Override
        public String toString() {
            return "|" + rank + " of " + suit + "|";
        }
    }
