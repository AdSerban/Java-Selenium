package JavaArray_1;

public class MakeMiddle {
    /**
     * Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
     * <p>
     * <p>
     * makeMiddle([1, 2, 3, 4]) → [2, 3]
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public int[] makeMiddle(int[] nums) {

        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};

    }

}
