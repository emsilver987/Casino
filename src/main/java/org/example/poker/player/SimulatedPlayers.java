package org.example.poker.player;

import org.example.poker.logic.SimulatedTableActions;
import java.util.Random;

public class SimulatedPlayers {
    private SimulatedTableActions[] simulatedPlayers;
    private Random rand = new Random();

    public SimulatedPlayers() {
        simulatedPlayers = new SimulatedTableActions[] {
                new SimulatedTableActions(new Player1()),
                new SimulatedTableActions(new Player2()),
                new SimulatedTableActions(new Player3()),
                new SimulatedTableActions(new Player4()),
                new SimulatedTableActions(new Player5())
        };
    }

    public void runSimulatedPlayers() {
        for (SimulatedTableActions playerAction : simulatedPlayers) {
            int randomNum = rand.nextInt(3) + 1; // Not truly random
            playerAction.tableChoice(randomNum);
        }
    }
}
