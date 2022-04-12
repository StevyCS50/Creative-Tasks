package basicconcepts.one.one.twentysix.main;

//if (a > b) { t = a; a = b; b = t; }
//if (a > c) { t = a; a = c; c = t; }
//if (b > c) { t = b; b = c; c = t; }

public class Solution {

    int a;
    int b;
    int c;
    int t;

    public void tryProof() {
        for (int i = 0; i < 10; i++) {


            a = (int) (Math.random() * (20 - 5 + 1)) + 5;
            b = (int) (Math.random() * (20 - 5 + 1)) + 5;
            c = (int) (Math.random() * (20 - 5 + 1)) + 5;
            t = (int) (Math.random() * (20 - 5 + 1)) + 5;

            if (a > b) {
                t = a;
                a = b;
                b = t;
            }

            if (a > c) {
                t = a;
                a = c;
                c = t;
            }

            if (b > c) {
                t = b;
                b = c;
                c = t;
            }
            System.out.print(a + " " + b + " " + c);
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.tryProof();
    }
}
