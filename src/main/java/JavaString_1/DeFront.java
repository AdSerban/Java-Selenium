package JavaString_1;

public class DeFront {
    public static void main(String[] args) {

        DeFront deFront = new DeFront();
        String str = "Hello";
        deFront.deFront(str);
    }

    public String deFront(String str) {
        String string = "";
        for (int i = 0; i < str.length(); i++) {

            if (i == 0 && str.charAt(i) == 'a') {
                string = string + 'a';
                System.out.println("1" + string);
            } else if (i == 1 && str.charAt(i) == 'b') {
                string = string + 'b';
                System.out.println("2" + string);
            } else if (i > 1) {
                string = string + str.charAt(i);
                System.out.println("al trei lea: " + string);
            }
        }
        return string;
    }

}
