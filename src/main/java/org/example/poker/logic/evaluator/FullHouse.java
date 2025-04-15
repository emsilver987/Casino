package org.example.poker.logic.evaluator;

import org.example.poker.Card;
import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRankType;

import java.util.*;

public class FullHouse extends HandRankEvaluator {

    public FullHouse(){
        Flush flush = new Flush();
        setNext(flush);
    }

    @Override
    public HandRank evaluateIfMatches(List<Card> hand) {
        Map<Integer, Integer> rankCounts = new HashMap<>();

        for (Card card : hand) {
            int rank = card.getRankIndex();
            rankCounts.put(rank, rankCounts.getOrDefault(rank, 0) + 1);
        }

        Integer threeOfKindRank = null;
        Integer pairRank = null;

        for (Map.Entry<Integer, Integer> entry : rankCounts.entrySet()) {
            int rank = entry.getKey();
            int count = entry.getValue();

            if (count == 3) {
                if (threeOfKindRank == null || rank > threeOfKindRank) {
                    threeOfKindRank = rank;
                }
            } else if (count >= 2) {
                if (pairRank == null || rank > pairRank) {
                    pairRank = rank;
                }
            }
        }

        if (threeOfKindRank != null) {
            if (pairRank != null && pairRank.equals(threeOfKindRank)) {
                pairRank = null;
                for (Map.Entry<Integer, Integer> entry : rankCounts.entrySet()) {
                    int rank = entry.getKey();
                    int count = entry.getValue();
                    if (rank != threeOfKindRank && count >= 2) {
                        if (pairRank == null || rank > pairRank) {
                            pairRank = rank;
                        }
                    }
                }
            }

            if (pairRank != null) {
                List<Integer> tiebreakers = Arrays.asList(threeOfKindRank, pairRank);
                return new HandRank(HandRankType.FULL_HOUSE, tiebreakers);
            }
        }

        if (next != null) {
            return next.evaluate(hand);
        }

        return null;
    }
}
