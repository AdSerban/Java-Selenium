package JavaArray_1;

public class MiddleWay {
    /**
     * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
     * <p>
     * <p>
     * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
     * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
     * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
     *
     * @param args
     */

    public static void main(String[] args) {

        MiddleWay middleWay = new MiddleWay();
        int[] mid = {1, 2, 3};
        int[] mid2 = {4, 5, 6};

        System.out.println(middleWay.middleWay(mid, mid2));
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] arr = new int[]{a[a.length - 2], b[b.length - 2]};
        return arr;
    }


}
