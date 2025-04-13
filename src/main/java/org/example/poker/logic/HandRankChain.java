package org.example.poker.logic;

import org.example.poker.logic.evaluator.*;
import org.example.poker.logic.handRank.HandRankEvaluator;

public class HandRankChain {

    public static HandRankEvaluator startChain(){
        RoyalFlush royal = new RoyalFlush();
        StraightFlush straightFlush = new StraightFlush();
        FourOfKind fourOfAKind = new FourOfKind();
        FullHouse fullHouse = new FullHouse();
        Flush flush = new Flush();
        Straight straight = new Straight();
        ThreeOfKind threeOfKind = new ThreeOfKind();
        TwoPair twoPair = new TwoPair();
        OnePair onePair = new OnePair();
        HighCard highCard = new HighCard();

        royal.setNext(straightFlush);
        straightFlush.setNext(fourOfAKind);
        fourOfAKind.setNext(fullHouse);
        fullHouse.setNext(flush);
        flush.setNext(straight);
        straight.setNext(threeOfKind);
        threeOfKind.setNext(twoPair);
        twoPair.setNext(onePair);
        onePair.setNext(highCard);

        return royal;
    }

}
