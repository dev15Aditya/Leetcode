package StriverSDEsheet;

import java.util.ArrayList;

public class setMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {

                    ArrayList<Integer> temp = new ArrayList<Integer>();
                    temp.add(i);
                    temp.add(j);
                    ar.add(temp);
                }
            }
        }

        for (int i = 0; i < ar.size(); i++) {
            int row = ar.get(i).get(0);
            int col = ar.get(i).get(1);

            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }

            for (int j = 0; j < matrix.length; j++) {
                matrix[j][col] = 0;
            }
        }
    }
}
