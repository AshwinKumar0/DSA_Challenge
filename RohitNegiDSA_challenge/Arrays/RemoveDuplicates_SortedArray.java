import java.util.Arrays;

//Given a sorted array A[] of size N, delete all the duplicated elements from A[]. Modify the array such that if there are X distinct elements in it then the first X
// positions of the array should be filled with them in increasing order and return the number of distinct elements in the array.
//
//        Note:
//        1. Don't use set or HashMap to solve the problem.
//        2. You must return the number of distinct elements(X) in the array, the generated output will print all the elements of the modified array from index 0 to X-1.
//
//        Example 1:
//
//        Input:
//        N = 5
//        Array = {2, 2, 2, 2, 2}
//        Output: {2}
//        Explanation: After removing all the duplicates
//        only one instance of 2 will remain.
public class RemoveDuplicates_SortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,3,3,4,5,8,99};

        int index = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i+1]){
                arr[index] = arr[i+1];
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(index);
    }
}
