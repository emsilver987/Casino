package org.example.poker.logic.evaluator;

import org.example.poker.Card;
import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRankType;

import java.util.*;

public class HighCard extends HandRankEvaluator {

    @Override
    public HandRank evaluateIfMatches(List<Card> hand) {
        List<Integer> ranks = new ArrayList<>();
        for (Card card : hand) {
            ranks.add(card.getRankIndex());
        }
        ranks.sort(Comparator.reverseOrder());

        return new HandRank(HandRankType.HIGH_CARD, ranks);
    }
}
