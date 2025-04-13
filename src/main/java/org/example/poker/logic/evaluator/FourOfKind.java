package org.example.poker.logic.evaluator;

import org.example.poker.Card;
import org.example.poker.logic.HandRankChain;
import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRankType;

import java.util.*;

public class FourOfKind extends HandRankEvaluator {

    @Override
    public HandRank evaluateIfMatches(List<Card> hand) {
        Map<Integer, Integer> rankCounts = new HashMap<>();
        for (Card card : hand) {
            int rank = card.getRankIndex();
            rankCounts.put(rank, rankCounts.getOrDefault(rank, 0) + 1);
        }

        Integer fourRank = null;
        Integer kicker = null;

        for (Map.Entry<Integer, Integer> entry : rankCounts.entrySet()) {
            int rank = entry.getKey();
            int count = entry.getValue();

            if (count == 4) {
                fourRank = rank;
            } else if (count == 1) {
                kicker = rank;
            }
        }

        if (fourRank != null) {
            List<Integer> tiebreakers = new ArrayList<>();
            tiebreakers.add(fourRank);
            if (kicker != null) {
                tiebreakers.add(kicker);
            }
            return new HandRank(HandRankType.FOUR_OF_A_KIND, tiebreakers);
        }

        if (next != null) {
            return next.evaluate(hand);
        }

        return null;
    }
}
