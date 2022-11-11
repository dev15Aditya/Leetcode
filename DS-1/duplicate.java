import java.util.HashMap;
import java.util.Map;

public class duplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(arr[i])) return false;
            map.put(arr[i],i);
        }
        return true;
    }
}
