package JavaArray_1;

public class Reverse3 {

    /**
     * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
     * <p>
     * reverse3([1, 2, 3]) → [3, 2, 1]
     * reverse3([5, 11, 9]) → [9, 11, 5]
     * reverse3([7, 0, 0]) → [0, 0, 7]
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public int[] reverse3(int[] nums) {
        int[] array = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[nums.length - 1 - i];


        }
        return array;
    }

}
