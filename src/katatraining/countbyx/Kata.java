package katatraining.countbyx;

import java.util.Arrays;

public class Kata{
    public static int[] countBy(int x, int n){
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = x * (i + 1);
        }
        return ar;
    }
}