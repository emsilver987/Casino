package org.example;

public class Messages {
    private static String welcome = "Welcome To The Casino\nYour Balance Starts at 1000 coins"; //Eventaully want to have incremenet and decrement
    private static String welcomeBlackjack = "Blackjack! 100 coins to play, let us start!";
    private static String dealerBusts = "Dealer Busts, you win!";
    private static String playerBusts = "You Bust, you lose!";
    private static String hitOrStay = "Do You Hit or Stay?";
    private static String playerScore = "Your Cards Total: ";

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
