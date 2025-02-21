package org.example;
import java.util.Random;

public class randomNumber {
    public static int generate() {
        Random random = new Random();
        int randomNumber = random.nextInt(13);
        return randomNumber;
    }
}
