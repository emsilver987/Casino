package org.example.poker.logic.evaluator;

import org.example.poker.Card;
import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRankType;

import java.util.*;

public class RoyalFlush extends HandRankEvaluator {

    private final StraightEvaluator straightEvaluator = new StraightEvaluator();
    private final FlushEvaluator flushEvaluator = new FlushEvaluator();

    @Override
    protected HandRank evaluateIfMatches(List<Card> hand) {
        HandRank straightRank = straightEvaluator.evaluateIfMatches(hand);
        HandRank flushRank = flushEvaluator.evaluateIfMatches(hand);
        if (straightRank != null && flushRank != null
                && straightRank.getType() == HandRankType.STRAIGHT
                && flushRank.getType() == HandRankType.FLUSH) {
            List<Integer> royalRanks = Arrays.asList(10, 11, 12, 13, 14);
            Set<Integer> handRanks = new HashSet<>();
            for (Card card : hand) {
                handRanks.add(card.getRankIndex());
            }
            if (handRanks.containsAll(royalRanks)) {
                return new HandRank(HandRankType.ROYAL_FLUSH, new ArrayList<>(royalRanks));
            }
        }
        return null;
    }
}
