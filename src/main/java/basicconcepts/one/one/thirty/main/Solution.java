package basicconcepts.one.one.thirty.main;

import java.util.Arrays;
import java.util.Scanner;
import org.springframework.util.CollectionUtils;

public class Solution {
    // Находим НОД с помощью алгоритма Евклида
    public static int getGcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGcdByEuclidsAlgorithm(n2, n1 % n2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arraySizes = null;
        System.out.println("Введите два числа");
        int sizeI = 0;
        int sizeJ = 0;
        if (in.hasNext()) {
            arraySizes = in.nextLine();
        }

        String[] numberSize = arraySizes.split(" ");
        if(numberSize.length > 2) {
            System.out.println("Вы ввели больше двух чисел");
        } else {
            for (int i = 0; ; ) {
                try {
                    Integer.parseInt(numberSize[i]);
                    Integer.parseInt(numberSize[i + 1]);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    System.out.println("Вы ввели не число или чисел меньше двух");
                    break;
                }
                sizeI = Integer.parseInt(numberSize[i]);
                sizeJ = Integer.parseInt(numberSize[i + 1]);
                break;
            }
            int gcdByEuclidsAlgorithm = getGcdByEuclidsAlgorithm(sizeI, sizeJ);
            //Наименьший делитель 1
            if(gcdByEuclidsAlgorithm == 1) {
                int[][] trueArray = new int[sizeI][sizeJ];
                for(int i = 0; i < sizeI; i++) {
                    for(int j = 0; j < sizeJ; j++) {
                        trueArray[i][j] = 1;
                    }
                }

                for(int[] array: trueArray) {
                    for(int array2: array) {
                        System.out.print(array2);
                    }
                    System.out.println();
                }
            } else {
                int[][] falseArray = new int[sizeI][sizeJ];
                for(int i = 0; i < sizeI; i++) {
                    for(int j = 0; j < sizeJ; j++) {
                        falseArray[i][j] = 0;
                    }
                }
                for(int[] array: falseArray) {
                    for(int array2: array) {
                        System.out.print(array2);
                    }
                    System.out.println();
                }
            }
        }
    }
}
