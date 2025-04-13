package org.example.poker.logic.handRank;

import org.example.poker.Card;
import org.example.poker.player.User;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class HandRankingTest {

    List<Card> cards;

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

    @Test
    public void RoyalFlush() {
        User user = new User();
        Card card = new Card("Diamonds", "J");
        Card card2 = new Card("Diamonds", "10");
        Card card3 = new Card("Hearts", "3");
        Card card4 = new Card("Clubs", "4");
        Card card5 = new Card("Diamonds", "A");
        Card card6 = new Card("Diamonds", "Q");
        Card card7 = new Card("Diamonds", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        HandRanking hr = new HandRanking();
        HandRank rank = hr.evaluateHand(user);
        assertEquals("Royal Flush", rank);
    }

    @Test
    public void StraightFlush() {
        User user = new User();
        Card card = new Card("Spades", "3");
        Card card2 = new Card("Spades", "5");
        Card card3 = new Card("Hearts", "3");
        Card card4 = new Card("Spades", "4");
        Card card5 = new Card("Diamonds", "A");
        Card card6 = new Card("Spades", "2");
        Card card7 = new Card("Spades", "6");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        HandRanking hr = new HandRanking();
        HandRank rank = hr.evaluateHand(user);
        assertEquals("Straight Flush", rank);
    }

    @Test
    public void FourOfKind() {
        User user = new User();
        Card card = new Card("Clubs", "Q");
        Card card2 = new Card("Diamonds", "10");
        Card card3 = new Card("Spades", "3");
        Card card4 = new Card("Clubs", "Q");
        Card card5 = new Card("Diamonds", "Q");
        Card card6 = new Card("Hearts", "Q");
        Card card7 = new Card("Diamonds", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        HandRanking hr = new HandRanking();
        HandRank rank = hr.evaluateHand(user);
        assertEquals("Four of a Kind", rank);

    }

    @Test
    public void FullHouse() {
        User user = new User();
        Card card = new Card("Hearts", "3");
        Card card2 = new Card("Diamonds", "3");
        Card card3 = new Card("Hearts", "Q");
        Card card4 = new Card("Clubs", "3");
        Card card5 = new Card("Diamonds", "Q");
        Card card6 = new Card("Spades", "2");
        Card card7 = new Card("Diamonds", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        HandRanking hr = new HandRanking();
        HandRank rank = hr.evaluateHand(user);
        assertEquals("Full House", rank);

    }

    @Test
    public void Flush() {
        User user = new User();
        Card card = new Card("Diamonds", "J");
        Card card2 = new Card("Spades", "10");
        Card card3 = new Card("Spades", "3");
        Card card4 = new Card("Clubs", "4");
        Card card5 = new Card("Spades", "2");
        Card card6 = new Card("Spades", "3");
        Card card7 = new Card("Spades", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        HandRanking hr = new HandRanking();
        HandRank rank = hr.evaluateHand(user);
        assertEquals("Flush", rank);

    }

    @Test
    public void Straight() {
        User user = new User();
        Card card = new Card("Diamonds", "5");
        Card card2 = new Card("Spades", "7");
        Card card3 = new Card("Spades", "3");
        Card card4 = new Card("Clubs", "6");
        Card card5 = new Card("Diamonds", "2");
        Card card6 = new Card("Spades", "8");
        Card card7 = new Card("Hearts", "9");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        HandRanking hr = new HandRanking();
        HandRank rank = hr.evaluateHand(user);
        assertEquals("Straight", rank);
    }

    @Test
    public void ThreeOfKind() {
        User user = new User();
        Card card = new Card("Diamonds", "2");
        Card card2 = new Card("Spades", "10");
        Card card3 = new Card("Spades", "2");
        Card card4 = new Card("Clubs", "4");
        Card card5 = new Card("Clubs", "2");
        Card card6 = new Card("Hearts", "6");
        Card card7 = new Card("Spades", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        HandRanking hr = new HandRanking();
        HandRank rank = hr.evaluateHand(user);
        assertEquals("Three of a Kind", rank);
    }

    @Test
    public void TwoPair() {        User user = new User();
        Card card = new Card("Diamonds", "J");
        Card card2 = new Card("Spades", "10");
        Card card3 = new Card("Spades", "K");
        Card card4 = new Card("Clubs", "2");
        Card card5 = new Card("Spades", "J");
        Card card6 = new Card("Spades", "3");
        Card card7 = new Card("Spades", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        HandRanking hr = new HandRanking();
        HandRank rank = hr.evaluateHand(user);
        assertEquals("Two Pair", rank);
    }

    @Test
    public void OnePair() {
        User user = new User();
        Card card = new Card("Diamonds", "J");
        Card card2 = new Card("Clubs", "10");
        Card card3 = new Card("Spades", "2");
        Card card4 = new Card("Clubs", "4");
        Card card5 = new Card("Spades", "2");
        Card card6 = new Card("Diamonds", "3");
        Card card7 = new Card("Spades", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        HandRanking hr = new HandRanking();
        HandRank rank = hr.evaluateHand(user);
        assertEquals("Flush", rank);
    }

    @Test
    public void HighCard() {
        User user = new User();
        Card card = new Card("Diamonds", "J");
        Card card2 = new Card("Spades", "10");
        Card card3 = new Card("Spades", "3");
        Card card4 = new Card("Clubs", "K");
        Card card5 = new Card("Spades", "2");
        Card card6 = new Card("Spades", "4");
        Card card7 = new Card("Spades", "K");
        cards = new ArrayList<>();
        cards.add(card);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        HandRanking hr = new HandRanking();
        HandRank rank = hr.evaluateHand(user);
        assertEquals("High Card", rank);
    }
}

