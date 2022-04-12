package basicconcepts.one.one.twentynine.main;

import java.util.Random;

public interface SupportMethods {
    default int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
