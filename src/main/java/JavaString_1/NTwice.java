package JavaString_1;

public class NTwice {

    /**
     * Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
     * <p>
     * nTwice("Hello", 2) → "Helo"
     * nTwice("Chocolate", 3) → "Choate"
     * nTwice("Chocolate", 1) → "Ce"
     */
    public static void main(String[] args) {

        NTwice nTwice = new NTwice();
        String abc = "Hello";

        int a = 2;

        System.out.println(nTwice.nTwice(abc, a));
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n, str.length());

    }

}
