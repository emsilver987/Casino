package org.example.poker.player;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.poker.player.SimulatedPlayers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimulatedPlayersTest {

    @Test
    public void getAllPlayersTest(){
        User user = new User();
        SimulatedPlayers sim = new SimulatedPlayers();
        Players[] players = sim.getAllPlayers(user);
        assertEquals(6, players.length);
        assertEquals("Player 1", players[0].getUser());
        assertEquals("Player 2", players[1].getUser());
        assertEquals("Player 3", players[2].getUser());
        assertEquals("Player 4", players[3].getUser());
        assertEquals("Player 5", players[4].getUser());
        assertEquals("User", players[5].getUser());
    }
}
