package katatraining.fibonacci;

public class Fibonacci {
    public static long fib(int n) {
        int[] x = new int[n + 2];
        x[0] = 0;
        x[1] = 1;
        for (int i = 2; i <= n; i++) {
            x[i] = x[i - 1] + x[i - 2];
        }
        return x[n];
    }
}
