package org.example.poker;

import org.example.poker.player.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AllPlayersTest {

    @Test
    void testAddMoney() {
        User user = new User();
        int money = user.getMoney();
        user.addMoney(10);
        user.addMoney(15);
        assertEquals(money + 25, user.getMoney());
    }

    @Test
    void testSubtractMoney() {
        User user = new User();
        int money = user.getMoney();
        user.subtractMoney(10);
        assertEquals(money - 10, user.getMoney() );
    }

    @Test
    void testNegativeMoney(){
        User user = new User();
        assertThrows(IllegalArgumentException.class, () -> user.subtractMoney(user.getMoney() + 100));
    }

    @Test
    void testUserSetPlaying(){
        User user = new User();
        user.setPlaying(true);
        assertTrue(user.isPlaying());
    }


}
