package org.example.poker.logic.evaluator;

import org.example.poker.Card;
import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRankType;

import java.util.*;

public class OnePair extends HandRankEvaluator {

    @Override
    public HandRank evaluateIfMatches(List<Card> hand) {
        Map<Integer, Integer> rankCounts = new HashMap<>();

        for (Card card : hand) {
            int rank = card.getRankIndex();
            rankCounts.put(rank, rankCounts.getOrDefault(rank, 0) + 1);
        }

        Integer pairRank = null;
        List<Integer> kickers = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : rankCounts.entrySet()) {
            int rank = entry.getKey();
            int count = entry.getValue();

            if (count == 2) {
                pairRank = rank;
            } else {
                // add each non-pair card (singletons or triplet leftovers)
                for (int i = 0; i < count; i++) {
                    kickers.add(rank);
                }
            }
        }

        if (pairRank != null) {
            kickers.sort(Comparator.reverseOrder());
            // Keep top 3 kickers
            if (kickers.size() > 3) {
                kickers = kickers.subList(0, 3);
            }

            List<Integer> tiebreakers = new ArrayList<>();
            tiebreakers.add(pairRank);
            tiebreakers.addAll(kickers);

            return new HandRank(HandRankType.ONE_PAIR, tiebreakers);
        }

        // No pair found, pass to next
        if (next != null) {
            return next.evaluate(hand);
        }

        return null;
    }
}
