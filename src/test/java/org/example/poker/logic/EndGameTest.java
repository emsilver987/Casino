package org.example.poker.logic;

import org.example.poker.player.Player1;
import org.example.poker.player.Player2;
import org.example.poker.player.Player3;
import org.example.poker.player.Players;
import org.junit.jupiter.api.Test;
import org.example.poker.Table;
import org.example.poker.Deck;
import org.example.poker.logic.evaluator.*;
import org.example.poker.player.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EndGameTest {
    // Req
    // Method that takes number of players and divides pot correctly
        //Arg for List of Players Eligble, Arg for Amount of money
    // Method that compares all players hand rank
        //Arg for list of all players, will return List of Players (may only be one)
        //Needs to compare kickers
    Table table;

    @BeforeEach
    void setUp() {
        Table.resetInstance();
        this.table = Table.getInstance();
    }

    @Test
    void testOnePlayerSplit() {
        EndGame endGame = new EndGame();
        Players playerOne = new Player1();
        int playerMoneyStart = playerOne.getMoney();
        List<Players> playersList = new ArrayList<>();
        playersList.add(playerOne);
        table.addAccumulatedMoney(100);
        endGame.splitMoney(playersList);
        assertEquals(100 + playerMoneyStart, playerOne.getMoney());
    }

    @Test
    void testTwoPlayerSplit() {
        EndGame endGame = new EndGame();
        Players playerOne = new Player1();
        Players playerTwo = new Player2();
        int playerOneMoneyStart = playerOne.getMoney();
        int playerTwoMoneyStart = playerTwo.getMoney();
        List<Players> playersList = new ArrayList<>();
        playersList.add(playerOne);
        playersList.add(playerTwo);
        table.addAccumulatedMoney(100);
        endGame.splitMoney(playersList);
        assertEquals(100/2 + playerOneMoneyStart, playerOne.getMoney());
        assertEquals(100/2 + playerTwoMoneyStart, playerTwo.getMoney());
    }

}
