package JavaArray_1;

public class SameFirstLast {
    /**
     * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
     * <p>
     * <p>
     * sameFirstLast([1, 2, 3]) → false
     * sameFirstLast([1, 2, 3, 1]) → true
     * sameFirstLast([1, 2, 1]) → true
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public boolean sameFirstLast(int[] nums) {
        if (nums.length > 0 && nums[0] == nums[nums.length - 1]) {
            return true;
        } else
            return false;
    }

}
