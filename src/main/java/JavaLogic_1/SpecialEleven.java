package JavaLogic_1;

public class SpecialEleven {
    /**
     * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod
     * <p>
     * <p>
     * specialEleven(22) → true
     * specialEleven(23) → true
     * specialEleven(24) → false
     *
     * @param args
     */

    public static void main(String[] args) {

    }

    public boolean specialEleven(int n) {
        if (n % 11 == 0 || n % 11 == 1) {
            return true;
        } else {
            return false;
        }
    }

}
