package JavaString_1;

public class WithoutEnd2 {
    /**
     * Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.
     * <p>
     * <p>
     * withouEnd2("Hello") → "ell"
     * withouEnd2("abc") → "b"
     * withouEnd2("ab") → ""
     *
     * @param args
     */
    public static void main(String[] args) {
        WithoutEnd2 withoutEnd2 = new WithoutEnd2();
        String abc = "Hello";
        System.out.println(withoutEnd2.withouEnd2(abc));
    }

    public String withouEnd2(String str) {

        if (str.length() == 0) {
            return "";
        }

        if (str.length() <= 2) {
            return "";
        }
        if (str.length() > 2) {
            return str.substring(1, str.length() - 1);
        }

        return str;
    }

}
