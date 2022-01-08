package basicconcepts.oneonetwentyseven.main;

public class Solution {
    static int counter = 0;
    public static double binomial(int N, int k, double p) {
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            counter++;
            return 0.0;
        }
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    public static void main(String[] args) {
        binomial(5, 7, 1.5);
        System.out.println(counter);
    }
}
