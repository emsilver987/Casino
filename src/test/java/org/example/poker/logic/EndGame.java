package org.example.poker.logic;

import org.example.poker.player.Player1;
import org.example.poker.player.Player2;
import org.example.poker.player.Player3;
import org.example.poker.player.Players;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.example.poker.logic.EndGame;
import org.example.poker.Table;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EndGame {

    // Req
    // Method that takes number of players and divides pot correctly
        //Arg for List of Players Eligble, Arg for Amount of money
    // Method that compares all players hand rank
        //Arg for list of all players, will return List of Players (may only be one)
        //Needs to compare kickers


    @Test
    void testOnePlayerSplit() {
        EndGame endGame = new EndGame();
        Players playerOne = new Player1();
        int playerMoneyStart = playerOne.getMoney();
        List<Players> playersList = new ArrayList<>();
        playersList.add(playerOne);
        int money = 100;
        endGame.splitMoney(playersList, money);
        assertEquals(100 - playerMoneyStart, playerOne.getMoney());
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
        int money = 100;
        endGame.splitMoney(playersList, money);
        assertEquals(100/2 - playerOneMoneyStart, playerOne.getMoney());
        assertEquals(100/2 - playerTwoMoneyStart, playerTwo.getMoney());
    }

    @Test
    void testTwoPlayerSplit() {
        EndGame endGame = new EndGame();
        Players playerOne = new Player1();
        Players playerTwo = new Player2();
        Players playerThree = new Player3();
        int playerOneMoneyStart = playerOne.getMoney();
        int playerTwoMoneyStart = playerTwo.getMoney();
        int playerThreeMoneyStart = playerThree.getMoney();
        List<Players> playersList = new ArrayList<>();
        playersList.add(playerOne);
        playersList.add(playerTwo);
        playersList.add(playerThree);
        int money = 100;
        endGame.splitMoney(playersList, money);
        assertEquals(100/3 - playerOneMoneyStart, playerOne.getMoney());
        assertEquals(100/3 - playerTwoMoneyStart, playerTwo.getMoney());
        assertEquals(100/3 - playerThreeMoneyStart, playerThree.getMoney());
    }

}
