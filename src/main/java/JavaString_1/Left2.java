package JavaString_1;

public class Left2 {
    /**
     * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
     * <p>
     * <p>
     * left2("Hello") → "lloHe"
     * left2("java") → "vaja"
     * left2("Hi") → "Hi"
     *
     * @param args
     */

    public static void main(String[] args) {

    }

    public String left2(String str) {

        if (str.length() == 2) {
            return str;
        }
        if (str.length() > 2) {
            return str.substring(2, str.length()) + str.substring(0, 2);
        }
        return str;
    }

}
