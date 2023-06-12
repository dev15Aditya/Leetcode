package DynamicProgramming.FibonacciStyle;
// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct
// ways can you climb to the top?

public class climbingStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(steps(n));
    }

    /*
     * If we write down the first few ways to climb the stairs, we can see that
     * the number of ways to climb the stairs is the sum of the previous two
     * ways. This is the same as the Fibonacci sequence.
     */

    public static int steps(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1; // 1 way to climb 0 steps
        dp[1] = 2; // 1 way to climb 1 step
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // add the previous 2 steps
        }
        return dp[n - 1];
    }
}
