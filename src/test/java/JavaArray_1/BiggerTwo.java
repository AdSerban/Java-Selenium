package JavaArray_1;

import java.util.Arrays;

public class BiggerTwo {
    /**
     * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
     * <p>
     * <p>
     * biggerTwo([1, 2], [3, 4]) → [3, 4]
     * biggerTwo([3, 4], [1, 2]) → [3, 4]
     * biggerTwo([1, 1], [1, 2]) → [1, 2]
     *
     * @param args
     */
    public static void main(String[] args) {


    }

    public int[] biggerTwo(int[] a, int[] b) {
        if (Arrays.stream(a).sum() >= Arrays.stream(b).sum()) {
            return a;
        } else {
            return b;
        }

    }

}
