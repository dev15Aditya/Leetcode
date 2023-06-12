package DynamicProgramming.FibonacciStyle;

public class minCostClimbingStair {
    public static void main(String[] args) {
        int[] cost = { 10, 15, 20 };
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        // for(int i = cost.length-3;i>=0;i--){
        // cost[i] = cost[i]+Math.min(cost[i+1],cost[i+2]);
        // }
        // return Math.min(cost[0],cost[1]);
        int n = cost.length;
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return Math.min(cost[0], cost[1]);
        }

        int[] opt = new int[n + 1];
        opt[0] = 0;
        opt[1] = 0;
        for (int i = 2; i <= n; i++) {
            opt[i] = Math.min(cost[i - 1] + opt[i - 1], cost[i - 2] + opt[i - 2]);
        }
        return opt[n];
    }

}
