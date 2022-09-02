package katatraining.fibonacci;

public class Fibonacci {
    public static long fib(int n) {
        if (n < 2) {
            return n;
        } else {
            int a = 0;
            int b = 1;
            int c = 0;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }

    }
}


//        public static long fib(int n) {
//        int[] x = new int[n + 2];
//        x[0] = 0;
//        x[1] = 1;
//        for (int i = 2; i <= n; i++) {
//            x[i] = x[i - 1] + x[i - 2];
//        }
//        return x[n];
//    }
//}
