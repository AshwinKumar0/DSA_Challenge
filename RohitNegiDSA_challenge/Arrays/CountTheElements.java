//Count the elements
//        Given two arrays a and b. Given q queries each having a positive integer i denoting an index of the array a.
//        For each query, your task is to find all the elements less than or equal to qi in the array b.
//
//        Example 1:
//
//        Input:
//        N=6
//        a[] = {1, 2, 3, 4, 7, 9}
//        b[] = {0, 1, 2, 1, 1, 4}
//        Query 1 -> 5
//        Query 2 -> 4
//        Output : 6
//        6
//        Explanation: For 1st query, the given index is 5,
//        A[5] is 9 and in B all the elements
//        are smaller than 9.
//        For 2nd query, the given index is 4,
//        A[4] is 7 and in B all the elements
//        are smaller than 7.
//        Your Task:
//        Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function find() that takes array a , array b, array q as parameters and returns an array that contains the answer to the corresponding queries.
//
//
//
//        Expected Time Complexity: O(n).
//        Expected Auxiliary Space: O(n).

import java.util.Arrays;

public class CountTheElements {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,7,9};
        int[] b = {0,1,2,1,1,4};
        int[] q = {5,4};
        int[] ans = find(a,b,q);
        System.out.println(Arrays.toString(ans));
    }
    static int[] find(int[] a,int[] b,int[] q){
        int[] temp = new int[q.length];
        int[] ans = new int[temp.length];
        for (int i = 0; i < q.length; i++) {
              temp[i] =  a[q[i]];
        }
        for (int i = 0; i < temp.length; i++) {
            int Count = 0;
            for (int k : b) {
                if (k <= temp[i]) Count++;
            }
            ans[i] = Count;
        }
        return ans;
    }
}
