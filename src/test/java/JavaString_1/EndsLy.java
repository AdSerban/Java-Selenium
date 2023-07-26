package JavaString_1;

public class EndsLy {
    /**
     * Given a string, return true if it ends in "ly".
     * <p>
     * <p>
     * endsLy("oddly") → true
     * endsLy("y") → false
     * endsLy("oddy") → false
     *
     * @param args
     */
    public static void main(String[] args) {


    }

    public boolean endsLy(String str) {

        if (str.length() < 2) {
            return false;

        }
        String s2 = str.substring(str.length() - 2, str.length());
        String ly = "ly";

        if (ly.equals(s2)) {
            return true;
        } else {
            return false;
        }
    }

}
