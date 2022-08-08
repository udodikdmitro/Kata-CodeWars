package katatraining.blueandredmarbles;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BlueAndRedMarbles {
    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        BigDecimal a = new BigDecimal(blueStart + redStart - bluePulled - redPulled)
                .setScale(8, RoundingMode.FLOOR);
        BigDecimal b = new BigDecimal(blueStart - bluePulled)
                .setScale(8, RoundingMode.FLOOR);
        return b.divide(a, 8, RoundingMode.FLOOR).doubleValue();
    }
}

