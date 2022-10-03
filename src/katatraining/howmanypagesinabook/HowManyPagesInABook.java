package katatraining.howmanypagesinabook;

public class HowManyPagesInABook {
    public static int amountOfPages(int summary) {
        int k = 0;
        int n = 0;

        while (summary > 0) {
            int a = 9 * (int) Math.pow(10, k);
            if ((summary - a * (k + 1)) > 0) {
                n = n + a;
            } else {
                n = n + summary / (k + 1);
                break;
            }
            summary = summary - (k + 1) * a;
            k++;
        }
        return n;
    }
}