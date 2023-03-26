import java.util.Arrays;

public class MoveAllZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {15,12,0,0,0,2,2,19,6,17,16,20,0,2,16,0,10,0,14,15};
//        int Count = 0;
//        for (int i : arr) {
//            if (i == 0) Count++;
//        }
//        if (Count >= 1) {
//            int traverse = arr.length - Count;
//            for (int firstHand = 0; firstHand < traverse; firstHand++) {
//                   if(arr[firstHand] == 0){
//                       int secondHand = firstHand + 1;
//                       while (secondHand < arr.length && arr[secondHand] == 0){
//                           secondHand++;
//                       }
//                       swap(arr,firstHand,secondHand);
//                   }
//            }
//
//        }
//        else {
//            System.out.println(Arrays.toString(arr));
//        }
//        System.out.println(Arrays.toString(arr));
//
//    }
//    static void swap(int[] arr, int x, int y) {
//        int temp = arr[x];
//        arr[x] = arr[y];
//        arr[y] = temp;

        int Count = 0;
        for(int i : arr) {
            if (i !=0) {
                arr[Count] = i;
                Count++;
            }
        }
        while (Count < arr.length) {
            arr[Count] = 0;
            Count++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
