package katatraining.blueandredmarbles;

public class BlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, double redPulled) {
        double result = (blueStart - bluePulled)/(blueStart + redStart - bluePulled - redPulled);
        return result;
    }
}

