package org.example.poker.logic.handRank;
import org.example.poker.Card;

import java.util.List;

public abstract class HandRankEvaluator {
    protected HandRankEvaluator next;

    public void setNext(HandRankEvaluator next) {
        this.next = next;
    }

    public HandRank evaluate(List<Card> hand) {
        HandRank rank = evaluateIfMatches(hand);
        if (rank != null) {
            return rank;
        } else if (next != null) {
            return next.evaluate(hand);
        }
        return null;
    }

    protected abstract HandRank evaluateIfMatches(List<Card> hand);
}
