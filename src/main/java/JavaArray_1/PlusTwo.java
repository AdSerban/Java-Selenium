package JavaArray_1;

public class PlusTwo {
    /**
     * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
     * <p>
     * <p>
     * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
     * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
     * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
     *
     * @param args
     */

    public static void main(String[] args) {

    }

    public int[] plusTwo(int[] a, int[] b) {

        int i = 0;
        return new int[]{a[i], a[i + 1], b[i], b[i + 1]};
    }

}
