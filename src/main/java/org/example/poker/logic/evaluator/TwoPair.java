package org.example.poker.logic.evaluator;

import org.example.poker.Card;
import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRankType;

import java.util.*;

public class TwoPair extends HandRankEvaluator {

    @Override
    public HandRank evaluateIfMatches(List<Card> hand) {
        Map<Integer, Integer> rankCounts = new HashMap<>();

        // Count how many of each rank
        for (Card card : hand) {
            int rank = card.getRankIndex();
            rankCounts.put(rank, rankCounts.getOrDefault(rank, 0) + 1);
        }

        List<Integer> pairs = new ArrayList<>();
        Integer kicker = null;

        for (Map.Entry<Integer, Integer> entry : rankCounts.entrySet()) {
            int rank = entry.getKey();
            int count = entry.getValue();

            if (count == 2) {
                pairs.add(rank);
            } else if (count == 1) {
                kicker = rank;
            }
        }

        if (pairs.size() == 2) {
            pairs.sort(Comparator.reverseOrder());

            List<Integer> tiebreakers = new ArrayList<>();
            tiebreakers.addAll(pairs);

            if (kicker != null) {
                tiebreakers.add(kicker);
            }

            return new HandRank(HandRankType.TWO_PAIR, tiebreakers);
        }

        if (next != null) {
            return next.evaluate(hand);
        }

        return null;
    }
}
