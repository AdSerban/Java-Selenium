package JavaArray_1;

public class Fix23 {
    /**
     * @param args
     */

    public static void main(String[] args) {

    }
//    public int[] fix23(int[] nums) {
//        int i = 0;
//        while(nums[i]==2) {
//            nums[i+1] = 0;
//            i++;
//        }
//        return nums;
//    }

    public int[] fix23(int[] nums) {

        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }

        return nums;
    }

}
