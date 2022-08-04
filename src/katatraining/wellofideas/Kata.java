package katatraining.wellofideas;

public class Kata {

    public static String well(String[] x) {
        int j = 0;

        for (int i = 0; i < x.length; i++) {
            if ("good".equals(x[i])) {
                j++;
            }
        }

        return j == 0 ? "Fail!" : j > 2 ? "I smell a series!" : "Publish!";
    }

}