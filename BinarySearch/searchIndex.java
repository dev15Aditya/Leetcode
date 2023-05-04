package BinarySearch;

public class searchIndex {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1, mid = 0;
        if (target > nums[high])
            return high + 1;
        if (target < nums[low])
            return 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (target == nums[mid])
                return mid;
            else if (target > nums[mid])
                low = mid + 1;
            else
                high = mid - 1;

        }
        return low;
    }
}
