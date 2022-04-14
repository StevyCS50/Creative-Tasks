package basicconcepts.one.one.twentynine.main;

import basicconcepts.support_code.SupportMethods;

import java.util.Random;

public class Solution implements SupportMethods {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] whiteList = new int[30];
        int key = solution.getRandomNumber(1, 100);
        for (int i = 0; i < whiteList.length; i++) {
            whiteList[i] = solution.getRandomNumber(0, 100);
        }


        System.out.println("результат метода rank() " + rank(key, whiteList));
        System.out.println("результат метода count() " + count(whiteList));
    }

    public int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }


    public static int rank(int key, int[] whiteList) {
        int counterRankMethod = 0;
        for(int randomNumber: whiteList) {
            if (key > randomNumber) {
                counterRankMethod++;
            }
        }
        return counterRankMethod;
    }

    public static int count(int[] whiteList) {
        int counterZeroValue = 0;
        for(int randomNumber: whiteList) {
            if(randomNumber == 0) {
                counterZeroValue++;
            }
        }
        return counterZeroValue;
    }
}
