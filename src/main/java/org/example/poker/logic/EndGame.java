package org.example.poker.logic;

import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRanking;
import org.example.poker.player.Players;

public class EndGame {
    HandRanking handRanking = new HandRanking();

    public void run(Players[] players){
        for (Players player : players) {
            handRanking.evaluateHand(player);
        }
    }

}
