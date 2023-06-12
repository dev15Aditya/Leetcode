package StriverSDEsheet;

import java.util.HashSet;
import java.util.Set;

public class setMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        Set<Integer> r = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    r.add(i);
                    c.add(j);
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (r.contains(i) || c.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
