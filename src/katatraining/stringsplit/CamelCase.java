package katatraining.camelcase
class Solution {
    public static String camelCase(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        int displacement = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                stringBuilder.insert(i + displacement, " ");
                displacement++;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(Solution.camelCase("camelCasingTest"));
    }
}