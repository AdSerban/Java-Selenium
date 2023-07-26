package JavaString_1;

public class Without2 {
    public static void main(String[] args) {
        String abc = "HelloHe";
        Without2 without2 = new Without2();
        System.out.println(without2.without2(abc));
    }

    public String without2(String str) {


        if (str.length() == 2) {
            return "";
        }
        if (str.length() < 2) {
            return str;
        }

        String a = str.substring(0, 2);
        String b = str.substring(str.length() - 2);

        if (a.equals(b)) {

            return str.substring(2, str.length());
        } else
            return str;
    }

}
