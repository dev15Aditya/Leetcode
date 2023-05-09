package BiweeklyChallenge;

import java.util.HashMap;

public class distinctDiff {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 4, 2 };

        // Output: [-3,-1,1,3,5]
        int[] res = distinctDifferenceArray(nums);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] distinctDifferenceArray(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map2.put(nums[i], map2.getOrDefault(nums[i], 0) + 1);
        }
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            map2.put(nums[i], map2.get(nums[i]) - 1);
            if (map2.get(nums[i]) == 0)
                map2.remove(nums[i]);
            map1.put(nums[i], map1.getOrDefault(nums[i], 0) + 1);
            diff[i] = map1.size() - map2.size();
        }
        return diff;
    }
}
