package Top150Interview.Array;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int k = 2;
        rotateArray r = new rotateArray();
        r.rotate(arr, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public void rotate(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        if (k > arr.length) {
            k = k % arr.length;
        }

        int a = arr.length - k;

        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1)
            return;

        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
}
