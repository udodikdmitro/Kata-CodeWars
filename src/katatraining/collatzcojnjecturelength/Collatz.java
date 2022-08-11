package katatraining.collatzcojnjecturelength;

public class Collatz {
    public static long conjecture(long x) {
        int i = 1;
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