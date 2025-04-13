package org.example.poker.logic.handRank;

public enum HandRankType {
    TBD(0),
    HIGH_CARD(1),
    ONE_PAIR(2),
    TWO_PAIR(3),
    THREE_OF_A_KIND(4),
    STRAIGHT(5),
    FLUSH(6),
    FULL_HOUSE(7),
    FOUR_OF_A_KIND(8),
    STRAIGHT_FLUSH(9),
    ROYAL_FLUSH(10);

    private final int strength;

    HandRankType(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }
}
