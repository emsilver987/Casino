package org.example.poker.logic.handRank;

import org.example.poker.Card;
import org.example.poker.Deck;
import org.example.poker.logic.HandRankChain;
import org.example.poker.logic.evaluator.RoyalFlush;
import org.example.poker.player.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.example.poker.logic.handRank.HandRankType;

public class HandRankingTest {

    List<Card> cards;

    @BeforeEach
    void setUp() {
        Deck.resetInstance();
        HandRankChain.startChain();
    }

    @Test
    public void test5CombinationsIs21() {
        Card card = new Card("Diamonds", "Q");
        Card card2 = new Card("Spades", "2");
        Card card3 = new Card("Hearts", "3");
        Card card4 = new Card("Clubs", "4");
        Card card5 = new Card("Diamonds", "5");
        Card card6 = new Card("Clubs", "2");
        Card card7 = new Card("Diamonds", "6");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        HandRanking hr = new HandRanking();
        List combinations = hr.generate5CardCombinations(cards);
        assertEquals(21, combinations.size());
    }

    // Direct testing of Royal Flush will be 5 cards for a single hand it tests
    // Our 21 Combinations will all be run through this
    @Test
    public void RoyalFlush() {
        Card card = new Card("Diamonds", "J");
        Card card2 = new Card("Diamonds", "10");
        Card card3 = new Card("Diamonds", "A");
        Card card4 = new Card("Diamonds", "Q");
        Card card5 = new Card("Diamonds", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        RoyalFlush royalFlush = new RoyalFlush();
        HandRank rank = royalFlush.evaluateIfMatches(cards);
        assertEquals(HandRankType.ROYAL_FLUSH, rank.getType());
    }

    @Test
    public void StraightFlush() {
        Card card = new Card("Diamonds", "2");
        Card card2 = new Card("Diamonds", "4");
        Card card3 = new Card("Diamonds", "3");
        Card card4 = new Card("Diamonds", "5");
        Card card5 = new Card("Diamonds", "6");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        RoyalFlush royalFlush = new RoyalFlush();
        HandRank rank = royalFlush.evaluateIfMatches(cards);
        assertEquals(HandRankType.STRAIGHT_FLUSH, rank.getType());
    }

    @Test
    public void FourOfKind() {
        Card card = new Card("Diamonds", "4");
        Card card2 = new Card("Clubs", "10");
        Card card3 = new Card("Spades", "4");
        Card card4 = new Card("Diamonds", "4");
        Card card5 = new Card("Spades", "4");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        RoyalFlush royalFlush = new RoyalFlush();
        HandRank rank = royalFlush.evaluateIfMatches(cards);
        assertEquals(HandRankType.FOUR_OF_A_KIND, rank.getType());
    }

    @Test
    public void FullHouse() {
        Card card = new Card("Diamonds", "3");
        Card card2 = new Card("Spades", "2");
        Card card3 = new Card("Diamonds", "3");
        Card card4 = new Card("Clubs", "3");
        Card card5 = new Card("Diamonds", "2");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        RoyalFlush royalFlush = new RoyalFlush();
        HandRank rank = royalFlush.evaluateIfMatches(cards);
        assertEquals(HandRankType.FULL_HOUSE, rank.getType());
    }

    @Test
    public void Flush() {
        Card card = new Card("Diamonds", "5");
        Card card2 = new Card("Diamonds", "2");
        Card card3 = new Card("Diamonds", "A");
        Card card4 = new Card("Diamonds", "4");
        Card card5 = new Card("Diamonds", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        RoyalFlush royalFlush = new RoyalFlush();
        HandRank rank = royalFlush.evaluateIfMatches(cards);
        assertEquals(HandRankType.FLUSH, rank.getType());

    }

    @Test
    public void Straight() {
        Card card = new Card("Clubs", "J");
        Card card2 = new Card("Diamonds", "10");
        Card card3 = new Card("Hearts", "A");
        Card card4 = new Card("Spades", "Q");
        Card card5 = new Card("Diamonds", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        RoyalFlush royalFlush = new RoyalFlush();
        HandRank rank = royalFlush.evaluateIfMatches(cards);
        assertEquals(HandRankType.STRAIGHT, rank.getType());
    }

    @Test
    public void ThreeOfKind() {
        User user = new User();
        Card card = new Card("Hearts", "J");
        Card card2 = new Card("Clubs", "2");
        Card card3 = new Card("Diamonds", "A");
        Card card4 = new Card("Spades", "2");
        Card card5 = new Card("Diamonds", "2");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        RoyalFlush royalFlush = new RoyalFlush();
        HandRank rank = royalFlush.evaluateIfMatches(cards);
        assertEquals(HandRankType.THREE_OF_A_KIND, rank.getType());
    }

    @Test
    public void TwoPair() {
        Card card = new Card("Diamonds", "5");
        Card card2 = new Card("Spades", "4");
        Card card3 = new Card("Hearts", "4");
        Card card4 = new Card("Diamonds", "5");
        Card card5 = new Card("Hearts", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        RoyalFlush royalFlush = new RoyalFlush();
        HandRank rank = royalFlush.evaluateIfMatches(cards);
        assertEquals(HandRankType.TWO_PAIR, rank.getType());
    }

    @Test
    public void OnePair() {
        Card card = new Card("Diamonds", "2");
        Card card2 = new Card("Hearts", "10");
        Card card3 = new Card("Diamonds", "A");
        Card card4 = new Card("Spades", "4");
        Card card5 = new Card("Clubs", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        RoyalFlush royalFlush = new RoyalFlush();
        HandRank rank = royalFlush.evaluateIfMatches(cards);
        assertEquals(HandRankType.ONE_PAIR, rank.getType());
    }

    @Test
    public void HighCard() {
        Card card = new Card("Spades", "2");
        Card card2 = new Card("Hearts", "10");
        Card card3 = new Card("Diamonds", "A");
        Card card4 = new Card("Clubs", "4");
        Card card5 = new Card("Clubs", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        RoyalFlush royalFlush = new RoyalFlush();
        HandRank rank = royalFlush.evaluateIfMatches(cards);
        assertEquals(HandRankType.HIGH_CARD, rank.getType());
    }
}

