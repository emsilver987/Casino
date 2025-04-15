package org.example.poker.logic.evaluator;

import org.example.poker.Card;
import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRankType;

import java.util.*;

public class Straight extends HandRankEvaluator {

    private final StraightEvaluator straightEvaluator = new StraightEvaluator();

    public Straight(){
        ThreeOfKind threeOfKind = new ThreeOfKind();
        setNext(threeOfKind);
    }

    @Override
    public HandRank evaluateIfMatches(List<Card> hand) {
        HandRank straightRank = straightEvaluator.evaluateIfMatches(hand);
        if (straightRank != null && straightRank.getType() == HandRankType.STRAIGHT) {
            Set<Integer> handRanks = new HashSet<>();
            for (Card card : hand) {
                handRanks.add(card.getRankIndex());
            }
            return new HandRank(HandRankType.STRAIGHT, new ArrayList<>(handRanks));
        }

        if (next != null) {return next.evaluate(hand);}
        return null;
    }
}
