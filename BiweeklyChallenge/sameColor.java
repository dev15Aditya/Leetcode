package BiweeklyChallenge;

public class sameColor {
    public static void main(String[] args) {
        // Input: n = 4, queries = [[0,2],[1,2],[3,1],[1,1],[2,1]]
        // Output: [0,1,1,0,2]
        int n = 4;
        int[][] queries = { { 0, 2 }, { 1, 2 }, { 3, 1 }, { 1, 1 }, { 2, 1 } };
        int[] res = colorTheArray(n, queries);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static int[] colorTheArray(int n, int[][] queries) {
        int[] res = new int[queries.length];
        int[] color = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = i;
            count[i] = 1;
        }
        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            if (color[a] == color[b]) {
                res[i] = count[color[a]];
            } else {
                int c = color[a];
                int d = color[b];
                for (int j = 0; j < n; j++) {
                    if (color[j] == c) {
                        color[j] = d;
                        count[d]++;
                    }
                }
                count[c] = 0;
                res[i] = count[d];
            }
        }
        return res;
    }
}
