package org.example;

public class Messages {

    public static String getWelcomeMessage() {
        return welcome;
    }
    public static String getWelcomeBlackjackMessage() {
        return welcomeBlackjack;
    }
    public static String getDealerBustsMessage() {
        return dealerBusts;
    }
    public static String getPlayerBustsMessage() {
        return playerBusts;
    }
    public static String getHitOrStayMessage() {
        return hitOrStay;
    }
    public static String getPlayerScoreMessage(int playerScoreInt) {
        return playerScore + playerScoreInt ;
    }
}
