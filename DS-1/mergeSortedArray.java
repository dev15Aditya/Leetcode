import java.lang.reflect.Array;
import java.util.Arrays;

// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0}, nums2 = {2,5,6}; 
        int m = 3, n = 3;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i<n; i++){
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
        for(int nums:nums1) System.out.print(nums+" ");
    }
}
