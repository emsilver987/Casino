package org.example.poker.logic.evaluator;

import org.example.poker.Card;
import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRankType;

import java.util.*;

public class ThreeOfKind extends HandRankEvaluator {

    public ThreeOfKind(){
        TwoPair twoPair = new TwoPair();
        setNext(twoPair);
    }

    @Override
    public HandRank evaluateIfMatches(List<Card> hand) {
        Map<Integer, Integer> rankCounts = new HashMap<>();
        for (Card card : hand) {
            int rank = card.getRankIndex();
            rankCounts.put(rank, rankCounts.getOrDefault(rank, 0) + 1);
        }

        Integer threeRank = null;
        List<Integer> kickers = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : rankCounts.entrySet()) {
            int rank = entry.getKey();
            int count = entry.getValue();

            if (count == 3) {
                threeRank = rank;
            } else if (count == 1 || count == 2) {
                for (int i = 0; i < count; i++) {
                    kickers.add(rank);
                }
            }
        }

        if (threeRank != null) {
            kickers.sort(Comparator.reverseOrder());
            if (kickers.size() > 2) {
                kickers = kickers.subList(0, 2);
            }
            List<Integer> tiebreakers = new ArrayList<>();
            tiebreakers.add(threeRank);
            tiebreakers.addAll(kickers);
            return new HandRank(HandRankType.THREE_OF_A_KIND, tiebreakers);
        }

        if (next != null) {
            return next.evaluate(hand);
        }

        return null;
    }
}
