package JavaString_1;

public class MiddleTwo {
    /**
     * Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
     * <p>
     * <p>
     * middleTwo("string") → "ri"
     * middleTwo("code") → "od"
     * middleTwo("Practice") → "ct"
     *
     * @param str
     * @return
     */
    public static void main(String[] args) {

    }

    public String middleTwo(String str) {

        if (str.length() == 0) {
            return str;
        } else {
            int juma = str.length() / 2;
            return str.substring(juma - 1, juma + 1);
        }
    }
}
