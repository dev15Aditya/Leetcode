package Top150Interview.BinarySearch;

public class search2D {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 }, { 51, 52, 53, 54 } };
        int target = 23;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length, col = matrix[0].length;
        int low = 0, high = row * col - 1, mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            int midVal = matrix[mid / col][mid % col];
            if (target == midVal)
                return true;
            else if (target > midVal)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
}
