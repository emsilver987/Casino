package org.example.poker.logic;

import org.junit.jupiter.api.Test;
import org.example.poker.Table;
import static org.junit.jupiter.api.Assertions.*;

public class EndGame {

    // Req
    // Method that takes number of players and divides pot correctly
        //Arg for List of Players Eligble, Arg for Amount of money
    // Method that compares all players hand rank
        //Arg for list of all players, will return List of Players (may only be one)
        //Needs to compare kickers
    //

    @Test
    void testToString() {

    }

    void testAddAcculmatedMoney() {
        Table table = Table.getInstance();
        table.addAccumulatedMoney(20);
        table.addAccumulatedMoney(15);
        int money = table.getAccumulatedMoney();
        assertEquals(35, money);
    }


}
