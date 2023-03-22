import java.util.ArrayList;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int N = 5;
        int[] a = {2,3,1,2,3};
        findDuplicates(a,N);
    }
    static <List> void findDuplicates(int[] a, int N) {
        int[] frequency = new int[N];
        for(int j : a) frequency[j]++;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < N; i++){
            if (frequency[i] > 1) {
                ans.add(i);
            }
        }
        if(ans.size() == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(ans);
        }

    }
}
