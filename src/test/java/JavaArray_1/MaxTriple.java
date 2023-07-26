package JavaArray_1;

public class MaxTriple {

    /**
     * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
     * <p>
     * <p>
     * unlucky1([1, 3, 4, 5]) → true
     * unlucky1([2, 1, 3, 4, 5]) → true
     * unlucky1([1, 1, 1]) → false
     *
     * @param args
     */

    public static void main(String[] args) {


    }

    public int maxTriple(int[] nums) {

        int first = nums[0];
        int mid = nums[nums.length / 2];
        int last = nums[nums.length - 1];

        if (first > mid && first > last) {
            return first;
        } else if (mid > first && mid > last) {
            return mid;
        } else {
            return last;
        }
    }
}
