package org.example.poker.logic.tableActions;

import org.example.poker.logic.tableActions.SimulatedTableActions;
import org.example.poker.player.Player1;
import org.example.poker.player.Players;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimulatedTableActionsTest {

    @Test
    public void InvalidTableChoice(){
        Players player = new Player1();
        SimulatedTableActions table = new SimulatedTableActions(player);
        assertThrows(IllegalArgumentException.class, () -> table.tableChoice(102));
    }

    @Test
    public void checkFoldChangesStatus(){
        Players player = new Player1();
        SimulatedTableActions table = new SimulatedTableActions(player);
        table.fold();
        assertFalse(player.isPlaying());
    }
}
