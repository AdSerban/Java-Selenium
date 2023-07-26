package JavaString_1;

public class WithoutX2 {
    /**
     * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.
     * <p>
     * <p>
     * withoutX2("xHi") → "Hi"
     * withoutX2("Hxi") → "Hi"
     * withoutX2("Hi") → "Hi"
     *
     * @param str
     * @return
     */
    public static void main(String[] args) {
        WithoutX2 withoutX2 = new WithoutX2();
        String string = "Hxxi";
        System.out.println(withoutX2.withoutX2(string) + " ------- ");
    }

    public String withoutX2(String str) {
        String string = "";

        for (int i = 0; i < str.length(); i++) {

            if (i == 0 && str.charAt(i) != 'x') {
                System.out.println("primu x este?" + string);
                string = string + str.charAt(i);
                System.out.println("primu x este?" + string);
            } else if (i == 1 && str.charAt(i) != 'x') {
                System.out.println("al doilea x este?" + string);
                string = string + str.charAt(i);
                System.out.println("al doilea x este?" + string);
            } else if (i > 1) {
                string = string + str.charAt(i);
                System.out.println("al treilea x este?" + string);
            }
        }
        return string;
    }


//    public String withoutX2(String str) {
//        if(str.length()==0) {
//            return str;
//        }
//        if(str.length()==2 &&  str.contains("xx")) {
//            return "";
//        }
//        if(str.length()<2 && str.substring(0,1).equals("xx")) {
//            return str.substring(1,str.length());
//        }
//        if(str.substring(0,1).equals("x")) {
//            return str.substring(1,str.length());
//        }
//        if(str.length()>3 && str.substring(0,2).equals("xx")) {
//            return str.substring(2,str.length());
//        }
//
//        return str;
//
//    }
}
