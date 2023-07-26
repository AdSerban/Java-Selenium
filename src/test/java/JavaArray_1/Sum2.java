package JavaArray_1;

public class Sum2 {

    /**
     * @param args
     */
    public static void main(String[] args) {

    }

    public int sum2(int[] nums) {

        if (nums.length == 0) {
            return 0;
        } else if (nums.length < 2) {
            return nums[0];
        } else {
            return nums[0] + nums[1];
        }
    }

}
