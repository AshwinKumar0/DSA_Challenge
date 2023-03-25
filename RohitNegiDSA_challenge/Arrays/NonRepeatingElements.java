import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElements {
    public static void main(String[] args) {
        int[] arr = {-1,2,-1,3,2};
        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }
        for (int i : arr){
            if (map.get(i) == 1){
                System.out.println(i);
            }
        }
    }
}
