//Numbers containing 1, 2 and 3
//        Given an array arr[] of n numbers. The task is to print only those numbers whose digits are from set {1,2,3}.
//
//        Example 1:
//
//        Input:
//        n = 3
//        arr[] = {4,6,7}
//        Output: -1
//        Explanation: No elements are there in the
//        array which contains digits 1, 2 or 3.
//        Example 2:
//
//        Input:
//        n = 4
//        arr[] = {1,2,3,4}
//        Output: 1 2 3
//        Explanation: 1, 2 and 3 are the only
//        elements in the array which contains
//        digits as 1, 2 or 3.

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class NumberContaining_1_2_3 {
    public static void main(String[] args) {
      int n = 5;
      int[] arr = {5,4,3,2,1};
        findAll(n, arr);
    }
    public static void findAll(int n, int[] arr) {
        Map<Integer, Integer> mp = new TreeMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            boolean found = true;
            while (num > 0) {
                int digit = num % 10;
                if (digit != 1 && digit != 2 && digit != 3) {
                    found = false;
                    break;
                }
                num /= 10;
            }
            if (found) {
                mp.put(arr[i], 1);
            }
        }
        if (mp.isEmpty()) {
            System.out.println("-1");
        } else {
            for (int key : mp.keySet()) {
                System.out.println(key);
            }
            System.out.println();
        }
    }
}
