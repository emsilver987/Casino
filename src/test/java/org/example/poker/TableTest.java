package org.example.poker;

import org.junit.jupiter.api.Test;
import org.example.poker.Table;
import static org.junit.jupiter.api.Assertions.*;

public class TableTest {

    @Test
    void testAddAcculmatedMoney() {
        Table table = Table.getInstance();
        table.addAccumulatedMoney(20);
        table.addAccumulatedMoney(15);
        int money = table.getAccumulatedMoney();
        assertEquals(35, money);
    }


}
