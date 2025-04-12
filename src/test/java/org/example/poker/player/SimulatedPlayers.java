//package org.example.poker.player;
//
//import org.example.poker.logic.tableActions.SimulatedTableActions;
//
//import java.util.Random;
//
//public class SimulatedPlayers {
//    private SimulatedTableActions[] simulatedPlayers;
//    private Random rand = new Random();
//    private Players[] players;
//
//    public SimulatedPlayers() {
//        players = new Players[]{
//                new Player1(),
//                new Player2(),
//                new Player3(),
//                new Player4(),
//                new Player5()
//        };
//        simulatedPlayers = new SimulatedTableActions[players.length];
//        for (int i = 0; i < players.length; i++) {
//            simulatedPlayers[i] = new SimulatedTableActions(players[i]);
//        }
//    }
//
//    public void runSimulatedPlayers() {
//        for (SimulatedTableActions playerAction : simulatedPlayers) {
//            int randomNum = rand.nextInt(3) + 1; //Is this truly random?
//            playerAction.tableChoice(randomNum);
//        }
//    }
//    public Players[] getAllPlayers(Players user) {
//        Players[] allPlayers = new Players[players.length + 1];
//        for (int i = 0; i < players.length; i++) {
//            allPlayers[i] = players[i];
//        }
//        allPlayers[players.length] = user;
//        return allPlayers;
//    }
//}
