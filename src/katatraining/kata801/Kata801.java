package katatraining.kata801;

public class Kata801 {
    public String derive (int a, int b) {
        if (a == 0 || b == 0 || b == 1) {
            return "Error in input of numbers!!!";
        } else {
            return a * b + "x^" + (b - 1);
        }
    }
}
