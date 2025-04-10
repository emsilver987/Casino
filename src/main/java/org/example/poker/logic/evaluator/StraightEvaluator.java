package org.example.poker.logic.evaluator;

import org.example.poker.Card;
import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRankType;

import java.util.*;

public class StraightEvaluator extends HandRankEvaluator {

    private boolean isStraight(List<Card> hand) {
        Set<Integer> rankSet = new HashSet<>();

        for (Card card : hand) {
            rankSet.add(card.getRankIndex());
        }

        List<Integer> sortedRanks = new ArrayList<>(rankSet);
        Collections.sort(sortedRanks);

        for (int i = 0; i <= sortedRanks.size() - 5; i++) {
            boolean straight = true;
            for (int j = 0; j < 4; j++) {
                if (sortedRanks.get(i + j) + 1 != sortedRanks.get(i + j + 1)) {
                    straight = false;
                    break;
                }
            }
            System.out.println("Straight hand.");
            if (straight) return true;
        }

        // Special case: Ace-low straight (A-2-3-4-5)
        if (rankSet.contains(12) && rankSet.contains(0) && rankSet.contains(1) && rankSet.contains(2) && rankSet.contains(3)) {
            System.out.println("Straight hand.");
            return true;
        }

        return false;
    }

    private int getHighCardOfStraight(List<Card> hand) {
        Set<Integer> rankSet = new HashSet<>();

        for (Card card : hand) {
            rankSet.add(card.getRankIndex());
        }

        List<Integer> sortedRanks = new ArrayList<>(rankSet);
        Collections.sort(sortedRanks);

        for (int i = sortedRanks.size() - 1; i >= 4; i--) {
            boolean straight = true;
            for (int j = 0; j < 4; j++) {
                if (sortedRanks.get(i - j) - 1 != sortedRanks.get(i - j - 1)) {
                    straight = false;
                    break;
                }
            }
            if (straight) return sortedRanks.get(i);
        }

        if (rankSet.contains(12) && rankSet.contains(0) && rankSet.contains(1) && rankSet.contains(2) && rankSet.contains(3)) {
            return 3; // The high card is 5 (index 3)
        }

        return -1; // Should never hit if called after isStraight returns true
    }

    @Override
    protected HandRank evaluateIfMatches(List<Card> hand) {
        if (isStraight(hand)) {
            int highCardIndex = getHighCardOfStraight(hand);
            return new HandRank(HandRankType.STRAIGHT, List.of(highCardIndex));
        }
        return null;
    }
}
