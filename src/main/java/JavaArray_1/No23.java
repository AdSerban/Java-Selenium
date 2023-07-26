package JavaArray_1;

public class No23 {
//    public boolean no23(int[] nums) {
//        for(int i = 0; i<nums.length ; i++) {
//            if(nums[i]!=2 ||nums[i]!=3) {
//                return true;
//            }
//        }
//        return false;
//    }

    public static void main(String[] args) {


    }

    public boolean no23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }
}

//cont pe codingBat