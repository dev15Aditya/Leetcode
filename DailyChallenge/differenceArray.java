package DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class differenceArray {
    public static void main(String[] args) {

    }

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums1[i]);
                temp.add(nums2[j]);
                result.add(temp);
                i++;
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums2[j]);
                temp.add(nums1[i]);
                result.add(temp);
                j++;
            }
        }
        while (i < nums1.length) {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums1[i]);
            temp.add(0);
            result.add(temp);
            i++;
        }
        while (j < nums2.length) {
            List<Integer> temp = new ArrayList<>();
            temp.add(nums2[j]);
            temp.add(0);
            result.add(temp);
            j++;
        }
        return result;
    }
}
