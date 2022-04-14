package basicconcepts.one.one.twentyeight.main;

import basicconcepts.support_code.SupportMethods;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] whiteList = solution.createWhiteList();
        int[] uniqueWhiteList = Arrays.stream(whiteList).distinct().toArray();
        int key = StdIn.readInt();
        if(solution.rank(key, uniqueWhiteList) < 0)
            StdOut.println(key);
    }

    public int[] createWhiteList() {
        int[] whiteList = new int[30];
        for (int i = 0; i < whiteList.length; i++) {
            whiteList[i] = SupportMethods.getRandomNumber(0, 100);
        }
        return whiteList;
    }

    public int rank(int key, int[] a) {
        //Массив должен быть отсортирован.
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            //Key находиться в a[lo..hi] или отсутствует
            int mid = lo + (hi - lo) / 2;
            if(key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
