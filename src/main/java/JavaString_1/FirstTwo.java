package JavaString_1;

public class FirstTwo {
    /**
     * Given a string, return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public String firstTwo(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() < 2) {
            return str;
        }
        if (str.length() > 2) {
            return str.substring(0, 2);
        }
        return str;
    }

}
