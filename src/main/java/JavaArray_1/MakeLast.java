package JavaArray_1;

public class MakeLast {
    /**
     * Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
     * <p>
     * <p>
     * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
     * makeLast([1, 2]) → [0, 0, 0, 2]
     * makeLast([3]) → [0, 3]
     *
     * @param args
     */

    public static void main(String[] args) {

    }

    public int[] makeLast(int[] nums) {
        int[] array = new int[nums.length * 2];
        array[array.length - 1] = nums[nums.length - 1];
        return array;

    }
}
