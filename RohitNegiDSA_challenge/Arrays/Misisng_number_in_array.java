class Solution {
    int MissingNumber(int array[], int n) {
        int Current_Sum = 0;
        for(int x : array){
            Current_Sum += x;
        }
        int Original_Sum = (n*n + n)/2;
        return Original_Sum - Current_Sum;
    }
}
