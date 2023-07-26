package JavaString_1;

public class Right2 {
    /**
     * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
     * <p>
     * <p>
     * right2("Hello") → "loHel"
     *
     * @param args
     */
    public static void main(String[] args) {


    }

    public String right2(String str) {
        if (str.length() == 2) {
            return str;
        }
        if (str.length() > 2) {
            return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        }
        return str;

    }

}
