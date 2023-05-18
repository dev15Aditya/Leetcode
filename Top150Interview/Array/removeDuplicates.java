package Top150Interview.Array;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicate(arr));
    }

    // Given an integer array nums sorted in non-decreasing order, remove some
    // duplicates in-place such that each unique element appears at most twice. The
    // relative order of the elements should be kept the same.

    public static int removeDuplicate2(int[] nums) {
        if (nums.length <= 2)
            return nums.length;
        int prev = 1; // point to previous
        int curr = 2; // point to current
        while (curr < nums.length) {
            if (nums[curr] == nums[prev] && nums[curr] == nums[prev - 1]) {
                curr++;
            } else {
                prev++;
                nums[prev] = nums[curr];
                curr++;
            }
        }
        return prev + 1;
    }

    public static int removeDuplicate(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return 0;

        int i = 0;
        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        for (int ele : nums) {
            System.out.print(ele + " ");
        }
        System.out.println();

        return i + 1;
    }
}
