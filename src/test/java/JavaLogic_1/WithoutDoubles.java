package JavaLogic_1;

public class WithoutDoubles {

    /**
     * Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
     * <p>
     * <p>
     * withoutDoubles(2, 3, true) → 5
     * withoutDoubles(3, 3, true) → 7
     * withoutDoubles(3, 3, false) → 6
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {

        int count = 0;
        if (noDoubles == true && die1 == die2 && die2 < 6) {
            die2 = die2 + 1;
            count = die1 + die2;
            return count;
        } else if (noDoubles == true && die1 == die2 && die2 == 6) {
            die2 = die2 - 5;
            count = die1 + die2;
            return count;

        } else
            count = die1 + die2;
        return count;

    }


}
