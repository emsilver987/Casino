package org.example.blackjack;
import java.util.Random;

enum Rank {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(10), QUEEN(11), KING(12), ACE(13);  // Ace can be 1 or 11, handled in game logic

    private final int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        if (value == 10 || value == 11 || value == 12){
            return 10;
        } else if (value == 13) {
            return 1; //or 11 to be dealt with later
        }
        else{
            return value;
        }
    }
}

public class BlackjackCard {
    private Rank rank;

    public BlackjackCard() {
        this.rank = getRandomRank();
    }

    private Rank getRandomRank() {
        Rank[] ranks = Rank.values();
        Random random = new Random();
        return ranks[random.nextInt(ranks.length)];
    }

    public int getValue() {
        return rank.getValue();
    }

    public String getCardFace() {
        return rank.name();
    }

    @Override
    public String toString() {
        return getCardFace();
    }
}
