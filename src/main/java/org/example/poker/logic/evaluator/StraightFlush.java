package org.example.poker.logic.evaluator;

import org.example.poker.Card;
import org.example.poker.logic.HandRankChain;
import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRankType;

import java.util.*;

public class StraightFlush extends HandRankEvaluator {

    private final StraightEvaluator straightEvaluator = new StraightEvaluator();
    private final FlushEvaluator flushEvaluator = new FlushEvaluator();

    @Override
    public HandRank evaluateIfMatches(List<Card> hand) {
        HandRank straightRank = straightEvaluator.evaluateIfMatches(hand);
        HandRank flushRank = flushEvaluator.evaluateIfMatches(hand);
        if (straightRank != null && flushRank != null
                && straightRank.getType() == HandRankType.STRAIGHT
                && flushRank.getType() == HandRankType.FLUSH) {
            Set<Integer> handRanks = new HashSet<>();
            for (Card card : hand) {
                handRanks.add(card.getRankIndex());
            }
            return new HandRank(HandRankType.STRAIGHT_FLUSH, new ArrayList<>(handRanks));
        }

        if (next != null) {return next.evaluate(hand);}
        return null;
    }
}
