package JavaLogic_1;

public class More20 {
    /**
     * Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod (https://codingbat.com/doc/practice/mod-introduction.html)
     *
     *
     * more20(20) → false
     * more20(21) → true
     * more20(22) → true
     * @param n
     * @return
     */

    public static void main(String[] args) {


    }


    public boolean more20(int n) {
        if (n % 20 == +1 || n % 20 == +2) {
            return true;
        } else
            return false;
    }

}
