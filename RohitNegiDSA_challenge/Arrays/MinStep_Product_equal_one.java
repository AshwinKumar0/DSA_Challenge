import java.util.Scanner;

//Minimum steps to make product equal to one
//        Given an array arr[] containing N integers. In one step, any element of the array can either be increased or decreased by one.
//        Find minimum steps required such that the product of the array elements becomes 1.
//        Example 1:
//
//        Input:
//        N = 3
//        arr[] = {-2, 4, 0}
//        Output:
//        5
//        Explanation:
//        We can change -2 to -1, 0 to -1 and 4 to 1.
//        So, a total of 5 steps are required
//        to update the elements such that
//        the product of the final array is 1.
//        Example 2:
//        Input:
//        N = 3
//        arr[] = {-1, 1, -1}
//        Output :
//        0
//        Explanation:
//        Product of the array is already 1.
//        So, we don't need to change anything.
//
//        Your Task:
//        You don't need to read input or print anything. Your task is to complete the function makeProductOne() which takes an integer N and an array arr of size N as input and returns the minimum steps required.
//
//
//        Expected Time Complexity: O(N)
//        Expected Auxiliary Space: O(1)
public class MinStep_Product_equal_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Input Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values of the Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(makeProductOne(arr,n));

    }
    static int makeProductOne(int[] arr, int N) {
         int Count = 0;
         int Total = 0;
         boolean flag = false;

         for (int i = 0; i < arr.length; i++) {
             if (arr[i] < 0) {
                 Count++;
                 int temp = arr[i] + 1;
                 Total += temp*-1;
             } else if (arr[i] > 0) {
                 int temp1 = arr[i] - 1;
                 Total += temp1;
             }
             else {
                 Total++;
                 flag = true;
             }
         }
         if (Count % 2 !=0 && !flag){
             Total += 2;
             return Total;
         }
        return Total;
    }
}
