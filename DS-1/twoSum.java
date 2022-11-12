import java.util.HashMap;
import java.util.Map;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15}; 
        int target = 9;
        System.out.println(twosum(nums, target));
    }
    public static int[] twosum(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i<arr.length; i++){
            if(map.containsKey(target-arr[i])){
                result[1] = i;
                result[0] = map.get(target-arr[i]);
            }

            map.put(arr[i], i);
        }
        return result;
    }
}
