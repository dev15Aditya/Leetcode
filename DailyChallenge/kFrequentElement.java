package DailyChallenge;

import java.util.Arrays;
import java.util.HashMap;

public class kFrequentElement {
    public static void main(String[] args) {
        int[] nums = { 4, 1, -1, 2, -1, 2, 3 };
        int k = 2;
        Arrays.sort(nums);
        int[] arr = topKFrequent(nums, k);
        for (int e : arr) {
            System.out.print(e + " ");
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[k];

        for (int ele : nums) {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            } else {
                map.put(ele, 1);

            }
        }

        // put key having top k values in arr
        int i = 0;
        for (int ele : map.keySet()) {
            if (i < k) {
                arr[i] = ele;
                i++;
            } else {
                break;
            }
        }

        // sort arr

        for (int j = 0; j < arr.length; j++) {
            for (int l = j + 1; l < arr.length; l++) {
                if (map.get(arr[j]) < map.get(arr[l])) {
                    int temp = arr[j];
                    arr[j] = arr[l];
                    arr[l] = temp;
                }
            }
        }

        return arr;
    }
}
