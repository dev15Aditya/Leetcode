package DailyChallenge;

public class spiralMat2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = generateMatrix(n);

        for (int[] i : matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int l = 0, r = n - 1, t = 0, b = n - 1;
        int num = 1, tar = n * n;

        while (num <= tar) {
            for (int i = l; i <= r; i++) {
                matrix[t][i] = num++;
            }
            t++;

            for (int i = t; i <= b; i++) {
                matrix[i][r] = num++;
            }
            r--;

            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    matrix[b][i] = num++;
                }
                b--;
            }

            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    matrix[i][l] = num++;
                }
                l++;
            }
        }
        return matrix;
    }
}
