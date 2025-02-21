package org.example;
import java.util.Random;

enum Rank {
    TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(10), QUEEN(10), KING(10), ACE(11);  // Ace can be 1 or 11, handled in game logic

    private final int value;

    Rank(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
public class Cards {
    private final Rank rank;

    public Cards(Rank rank) {
        this.rank = rank;
    }

    public int getValue() {
        return rank.getValue();
    }

    public String getCardFace() {
        return rank.name();
    }

    public void setRandomRank() {
        this.rank = getRandomRank();
    }

    private Rank getRandomRank() {
        Rank[] ranks = Rank.values();
        Random random = new Random();
        return ranks[random.nextInt(ranks.length)];
    }

    @Override
    public String toString() {
        return getCardFace();
    }
}
