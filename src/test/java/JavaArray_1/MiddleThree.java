package JavaArray_1;

public class MiddleThree {

    /**
     * Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.
     * <p>
     * <p>
     * midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
     */
    public static void main(String[] args) {

    }

    public int[] midThree(int[] nums) {

        return new int[]{
                nums[nums.length / 2 - 1],
                nums[nums.length / 2],
                nums[nums.length / 2 + 1]};

    }

}
