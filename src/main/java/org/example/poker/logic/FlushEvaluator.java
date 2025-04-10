package org.example.poker.logic;
import org.example.poker.Card;
import java.util.*;

public class FlushEvaluator extends HandRankEvaluator {


    private boolean isFlush(List<Card> hand) {
        String firstSuit = hand.get(0).getSuit();
        for (Card card : hand) {
            if (!Objects.equals(card.getSuit(), firstSuit)) {
                return false;
            }
        }
        return true;
    }

    private List<Integer> getSortedRanks(List<Card> hand) {
        List<Integer> ranks = new ArrayList<>();
        for (Card card : hand) {
            ranks.add(card.getRankIndex());
        }
        // Sort descending for tie-breaking
        ranks.sort(Comparator.reverseOrder());
        return ranks;
    }

    @Override
    protected HandRank evaluateIfMatches(List<Card> hand) {
        if (isFlush(hand)) {
            List<Integer> tiebreakers = getSortedRanks(hand);
            return new HandRank(HandRankType.FLUSH, tiebreakers);
        }
        return null;
    }
}
