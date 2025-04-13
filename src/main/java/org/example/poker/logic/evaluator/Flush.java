package org.example.poker.logic.evaluator;

import org.example.poker.Card;
import org.example.poker.logic.HandRankChain;
import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRankType;

import java.util.*;

public class Flush extends HandRankEvaluator {

    private final FlushEvaluator flushEvaluator = new FlushEvaluator();

    @Override
    public HandRank evaluateIfMatches(List<Card> hand) {
        HandRank flushRank = flushEvaluator.evaluateIfMatches(hand);
        if (flushRank != null && flushRank.getType() == HandRankType.FLUSH) {
            Set<Integer> handRanks = new HashSet<>();
            for (Card card : hand) {
                handRanks.add(card.getRankIndex());
            }
            return new HandRank(HandRankType.FLUSH, new ArrayList<>(handRanks));
        }

        if (next != null) {return next.evaluate(hand);}
        return null;
    }
}
