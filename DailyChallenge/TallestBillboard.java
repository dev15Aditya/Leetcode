package DailyChallenge;

public class TallestBillboard{
    public static void main(String[] args) {
        int[] rods = {1,2,3,6};
        System.out.println(tallestBillboard(rods));
    }

    public static int tallestBillboard(int[] rods) {
        int[][] dp = new int[rods.length + 1][5001];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < 5001; j++) {
                dp[i][j] = -1;
            }
        }
        return helper(rods, 0, 0, dp);
    }

    public static int helper(int[] rods, int i, int sum, int[][] dp) {
        if (i == rods.length) {
            return sum == 0 ? 0 : Integer.MIN_VALUE;
        }
        if (dp[i][sum] != -1) {
            return dp[i][sum];
        }
        int res = Math.max(helper(rods, i + 1, sum, dp), helper(rods, i + 1, sum + rods[i], dp) + rods[i]);
        res = Math.max(res, helper(rods, i + 1, sum - rods[i], dp));
        dp[i][sum] = res;
        return res;
    }
}