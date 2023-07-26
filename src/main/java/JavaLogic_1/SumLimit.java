package JavaLogic_1;

public class SumLimit {
    /**
     *
     Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)


     sumLimit(2, 3) → 5
     sumLimit(8, 3) → 8
     sumLimit(8, 1) → 9

     * @param a
     * @param b
     * @return
     */
    public static void main(String[] args) {

        SumLimit sumLimit = new SumLimit();
        System.out.println(sumLimit.sumLimit(11,99));
    }

    public int sumLimit(int a, int b) {

        String sum = Integer.toString(a + b);
        String aa = Integer.toString(a);

        if(sum.length() == aa.length())
            return a + b;
        else {
            return a;
        }

    }

}
