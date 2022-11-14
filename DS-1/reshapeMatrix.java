public class reshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;
        print2D(matrixReshape(mat, r, c));
    }
    public static void print2D(int mat[][])
    {
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int n = mat[0].length;
        if (r * c != mat.length * n) {
            return mat;
        }
        int[][] ans = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            ans[i / c][i % c] = mat[i / n][i % n];
        }
        return ans;
    }
}
