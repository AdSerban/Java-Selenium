package JavaArray_1;

public class MaxEnd3 {
    /**
     * Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
     * <p>
     * <p>
     * maxEnd3([1, 2, 3]) → [3, 3, 3]
     * maxEnd3([11, 5, 9]) → [11, 11, 11]
     * maxEnd3([2, 11, 3]) → [3, 3, 3]
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public int[] maxEnd3(int[] nums) {
        int i = 0;
        if (nums[i] > nums[nums.length]) {
            nums[i + 1] = nums[i];
            nums[i + 2] = nums[i];
        }
        if (nums[nums.length] > nums[i]) {

            nums[i] = nums[nums.length];
            nums[i + 1] = nums[nums.length];
        }
        return nums;
    }

}
