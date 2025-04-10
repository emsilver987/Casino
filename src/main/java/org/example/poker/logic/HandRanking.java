package org.example.poker.logic;
import org.example.poker.Card;

import java.util.ArrayList;
import java.util.List;

import org.example.poker.player.Players;
import org.example.poker.Table;

public class HandRanking {
    Table table;

    HandRanking(){
        this.table = Table.getInstance();
    }

    public HandRank evaluateHand(Players players) {
        HandRank bestHand = null;
        List<Card> allCards = new ArrayList<Card>();
        allCards.add(players.getCardOne());
        allCards.add(players.getCardTwo());
        allCards.add(table.getCard(1));
        allCards.add(table.getCard(2));
        allCards.add(table.getCard(3));
        allCards.add(table.getCard(4));
        allCards.add(table.getCard(5));
        List<List<Card>> combinations = generate5CardCombinations(allCards);

        for (List<Card> hand : combinations) {
            HandRank currentHand = evaluate5CardHand(hand);
//            if (bestHand == null || currentHand.compareTo(bestHand) > 0) {
//                bestHand = currentHand;
//            }
        }
        return bestHand;
    }

    public static List<List<Card>> generate5CardCombinations(List<Card> cards) {
        List<List<Card>> combinations = new ArrayList<>();
        generateCombinationsHelper(cards, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    private static void generateCombinationsHelper(List<Card> cards, int start, List<Card> current, List<List<Card>> combinations) {
        if (current.size() == 5) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < cards.size(); i++) {
            current.add(cards.get(i));
            generateCombinationsHelper(cards, i + 1, current, combinations);
            current.remove(current.size() - 1);
        }
    }

    private HandRank evaluate5CardHand(List<Card> hand) {
        return null;

        // Check for flush, straight, etc., and return an object representing the hand rank.
        // For instance, HandRank encapsulate the type (flush, straight, etc.) and tie-breaker values.
    }
}

