import java.util.Arrays;

//Given a sorted Vay with possibly duplicate elements. The task is to find indexes of first and last occurrences of an element X in the given Vay.
//
//        Note: If the element is not present in the Vay return {-1,-1} as pair.
//
//
//
//        Example 1:
//
//        Input:
//        N = 9
//        v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125}
//        X = 5
//        Output:
//        2 5
//        Explanation:
//        Index of first occurrence of 5 is 2
//        and index of last occurrence of 5 is 5.
public class FirstAndLastOccurence {
    public static void main(String[] args) {
        long[] V = {1, 3, 5, 5, 5, 67, 123, 125};
        int x = 5;
        int[] ans = new int[2];
        int first = findFirst(V, x);
        int last = findLast(V, x);
        ans[0] = first;
        ans[1] = last;
        System.out.println(Arrays.toString(ans));
    }
    static int findFirst(long[] V, long x) {
        int index = -1;
        int start = 0;
        int end = V.length - 1;
        while (start <= end) {
            int mid = start + (end - start) /2;
            if (V[mid] < x) {
                start = mid + 1;
            }
            else if (V[mid] > x) {
                end = mid - 1;
            }
            else {
                index = mid;
                end = mid - 1;
            }
        }
        return index;
    }

    static int findLast(long[] V, long x) {
        int index = -1;
        int start = 0;
        int end = V.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (V[mid] < x) {
                start = mid + 1;
            }
            else if (V[mid] > x) {
                end = mid - 1;
            }
            else {
                index = mid;
                start = mid + 1;
            }
        }
        return index;
    }
}
