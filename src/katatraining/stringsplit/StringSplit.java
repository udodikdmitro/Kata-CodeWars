package stringsplit
public class StringSplit {
    public static String[] solution(String s) {
        int arrayLength = Math.round((float) s.length() /2);
        String[] pairs = new String[arrayLength];
        int index = 0;

        for (int i = 0; i < s.length(); i += 2) {
            if (i + 1 < s.length()) {
                pairs[index] = s.substring(i, i + 2);
                index++;
            } else {
                pairs[index] = s.substring(i) + "_";
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        String[] ar = StringSplit.solution("HelloWorld");
        for(String s: ar) {
            System.out.println(s);
        }
    }
}