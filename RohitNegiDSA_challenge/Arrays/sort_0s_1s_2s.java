import java.util.Arrays;

public class sort_0s_1s_2s {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {0, 2, 1, 2, 0};
        System.out.println(Arrays.toString(sort012(arr, N)));
    }
//    static int[] sort012(int[] a, int n) {
//        int count = 0;
//        int findElement = 0;
//        int l = a.length;
//        while (count < l) {
//            for (int i = count; i < l; i++) {
//                if (a[i] == findElement) {
//                    swap(a, count, i);
//                    ++count;
//                    break;
//                } else if (i == l - 1 && a[i] != findElement) {
//                    ++findElement;
//                    ++count;
//                    break;
//                }
//            }
//
//        }
//        return a;
//    }
//        static void swap(int[] arr,int x,int y){
//            int temp = arr[x];
//            arr[x] = arr[y];
//            arr[y] = temp;
//        }
//
//}

    static int[] sort012(int[] a, int n) {
        int Count0 = 0;
        for (int i : a) {
            if (i == 0) Count0++;
        }
        int Count1 = Count0;
        for (int i : a) {
            if (i == 1) Count1++;
        }
        int Count2 = Count1;
        for (int i : a) {
            if (i == 2) Count2++;
        }
        System.out.println(Count0 + " " + Count1 + " " + Count2);
        for (int i = 0; i < Count0; i++) {
            a[i] = 0;
        }
        for (int i = Count0; i < Count1; i++) {
            a[i] = 1;
        }
        for (int i = Count1; i < Count2; i++) {
            a[i] = 2;
        }
        return a;
    }
}