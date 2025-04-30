package org.example.poker.logic;

import org.example.poker.logic.handRank.HandRank;
import org.example.poker.logic.handRank.HandRankEvaluator;
import org.example.poker.logic.handRank.HandRanking;
import org.example.poker.logic.tableActions.TableActions;
import org.example.poker.player.Players;
import org.example.poker.Table;

import java.util.ArrayList;
import java.util.List;

public class EndGame {
    HandRanking handRanking = new HandRanking();
    Table table;

    public EndGame(){
        table = Table.getInstance();
    }

    public void run(Players[] players){
        for (Players player : players) {
            HandRank hand = handRanking.evaluateHand(player);
            System.out.println(player.getUser() + " " + hand.getType());
        }
        compareHandRanks(players);
    }

    // Returns list of winning players
    public List<Players> compareHandRanks(Players[] players){
        List<Players> winners = new ArrayList<>();
        HandRank bestRank = null;
        for (Players player : players) {
            HandRank currentRank = handRanking.evaluateHand(player);
            if (bestRank == null) {
                bestRank = currentRank;
                winners.clear();
                winners.add(player);
            } else {
                int comparison = currentRank.compareTo(bestRank);
                if (comparison > 0) {
                    bestRank = currentRank;
                    winners.clear();
                    winners.add(player);
                } else if (comparison == 0) {
                    boolean beatsAny = false;
                    for (Players existingWinner : winners) {
                        HandRank existingRank = handRanking.evaluateHand(existingWinner);
                        if (currentRank.compareTo(existingRank) > 0) {
                            bestRank = currentRank;
                            winners.clear();
                            winners.add(player);
                            beatsAny = true;
                            break;
                        } else if (currentRank.compareTo(existingRank) < 0) {
                            beatsAny = true;
                            break;
                        }
                    }
                    if (!beatsAny) {
                        winners.add(player);
                    }
                }
            }
        }
        return winners;
    }

    public void splitMoney(List<Players> players){
        int divisionOfPot = table.getAccumulatedMoney()/players.size();
        for (Players player : players) {
           player.addMoney(divisionOfPot);
        }
    }

}
