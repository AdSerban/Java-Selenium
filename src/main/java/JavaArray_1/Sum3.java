package JavaArray_1;

public class Sum3 {

    /**
     * Given an array of ints length 3, return the sum of all the elements.
     * <p>
     * <p>
     * sum3([1, 2, 3]) → 6
     * sum3([5, 11, 2]) → 18
     * sum3([7, 0, 0]) → 7
     *
     * @param args
     */

    public static void main(String[] args) {


    }
//
//    public int sum3(int[] nums) {
//        return Arrays.stream(nums).sum();
//    }

    public int sum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = nums[i] + nums[i];
        }
        return sum;
    }
}
