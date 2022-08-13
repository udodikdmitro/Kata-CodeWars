package katatraining.collatzcojnjecturelength;

/**
Way to solve with recursion
public class Collatz {
    public static long conjecture(long x) {
        return x == 1 || x == 0 ? x : 1 + (x % 2 == 0 ?
                conjecture(x / 2)
                : conjecture(x * 3 + 1)
        );
    }
}
**/

public class Collatz {
    public static long conjecture(long x) {
        int i = 1;
        if (x == 0) {
            return 0;
        }

        do {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
            i++;
        }
        while (x != 1);
        return i;
    }
}