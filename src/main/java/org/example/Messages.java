package org.example;

public class Messages {
    private final static String welcome = "Welcome To The Casino\nYour Balance Starts at 1000 coins"; //Eventaully want to have incremenet and decrement
    private final static String welcomeBlackjack = "Blackjack! 100 coins to play, let us start!";
    private final static String dealerBusts = "Dealer Busts, you win!";
    private final static String playerBusts = "You Bust, you lose!";
    private final static String hitOrStay = "Do You Hit or Stay?";
    private final static String playerScore = "Your Cards Total: ";
    private final static String cardsDelt = "You were dealt the cards: ";

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
    public static String getCardsDeltMessage(String cardsDeltString) {//Would maybe do sepearte card dealt messages
        return cardsDelt + cardsDeltString;
    }
}
