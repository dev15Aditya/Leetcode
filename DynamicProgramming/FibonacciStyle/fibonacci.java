package DynamicProgramming.FibonacciStyle;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    // public static int fib(int n) {
    // int[] f = new int[n + 2];
    // f[0] = 0;
    // f[1] = 1;
    // for (int i = 2; i <= n; i++) {
    // f[i] = f[i - 1] + f[i - 2];
    // }

    // return f[n];
    // }

    // write using memoization
    public static int fib(int n) {
        int[] f = new int[n + 2];
        for (int i = 0; i < f.length; i++) {
            f[i] = -1;
        }
        if (n <= 1) {
            f[n] = n;
            return n;
        } else {
            if (f[n - 1] == -1) {
                f[n - 1] = fib(n - 1);
            }
            if (f[n - 2] == -1) {
                f[n - 2] = fib(n - 2);
            }
            f[n] = f[n - 1] + f[n - 2];
            return f[n];
        }
    }

    static int leastInterval(int N, int K, char tasks[]) {
        // code here
        int[] freq = new int[26];
        for (int i = 0; i < N; i++) {
            freq[tasks[i] - 'A']++;
        }
        int maxFreq = 0;
        int maxFreqCount = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxFreqCount = 1;
            } else if (freq[i] == maxFreq) {
                maxFreqCount++;
            }
        }
        int ans = (maxFreq - 1) * (K + 1) + maxFreqCount;
        return Math.max(ans, N);
    }

    // Given an array of strings arr[] of size n, a string str and an integer k. The
    // task is to find the count of strings in arr[] whose prefix of length k
    // matches with the k-length prefix of str.
    public int klengthpref(String[] arr, int n, int k, String str) {
        // code here
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i].substring(0, k).equals(str.substring(0, k))) {
                count++;
            }
        }
        return count;
    }
}
