package org.example;

public class Messages {
    private static final String welcome = "Welcome To The Casino\nYour Balance Starts at 1000 coins"; //Eventaully want to have incremenet and decrement
    private static final String welcomeBlackjack = "Blackjack! 100 coins to play, let us start!";
    private static final String dealerBusts = "Dealer Busts, you win!";
    private static final String playerBusts = "You Bust, you lose!";
    private static final String hitOrStay = "Do You Hit or Stay?";
    private static final String playerScore = "Your Cards Total: ";
    private static final String invalidMessage = "Invalid Message";

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
    public static String getInvalidMessage() {
        return invalidMessage;
    }
}
