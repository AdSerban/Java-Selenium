package JavaString_1;

public class AtFirst {
    /**
     * Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.
     * <p>
     * <p>
     * atFirst("hello") → "he"
     * atFirst("hi") → "hi"
     * atFirst("h") → "h@"
     */

    public static void main(String[] args) {


    }

    public String atFirst(String str) {

        if (str.length() == 0) {
            return "@@";
        }
        if (str.length() < 2) {
            return str + "@";
        }
        if (str.length() > 2) {
            return str.substring(0, 2);
        }
        return str;
    }

}
