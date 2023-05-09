package DailyChallenge;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 } };
        List<Integer> sp = spiralOrder(matrix);

        for (int i : sp) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> sp = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return sp;

        int row = matrix.length, col = matrix[0].length;
        int l = 0, r = col - 1, t = 0, b = row - 1;

        while (l <= r && t <= b) {
            for (int i = l; i <= r; i++) {
                sp.add(matrix[t][i]);
            }
            t++;

            for (int i = t; i <= b; i++) {
                sp.add(matrix[i][r]);
            }
            r--;

            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    sp.add(matrix[b][i]);
                }
                b--;
            }

            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    sp.add(matrix[i][l]);
                }
                l++;
            }
        }
        return sp;
    }
}