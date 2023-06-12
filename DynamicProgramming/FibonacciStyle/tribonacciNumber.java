package DynamicProgramming.FibonacciStyle;

public class tribonacciNumber {
    public static void main(String[] args) {
        System.out.println(tribonacci(10));
    }

    public static int tribonacci(int n) {
        int[] f = new int[n + 3];
        f[0] = 0;
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2] + f[i - 3];
        }

        return f[n];
    }
}
