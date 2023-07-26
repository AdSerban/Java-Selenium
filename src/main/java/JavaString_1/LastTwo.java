package JavaString_1;

public class LastTwo {
    /**
     * Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
     * <p>
     * <p>
     * lastTwo("coding") → "codign"
     * lastTwo("cat") → "cta"
     * lastTwo("ab") → "ba"
     *
     * @param args
     */
    public static void main(String[] args) {

    }

    public String lastTwo(String str) {
        while (str.length() >= 2) {
            String a = str.substring(0, str.length() - 2);
            String b = str.substring(str.length() - 2, str.length() - 1);
            String c = str.substring(str.length() - 1, str.length());
            return a + c + b;
        }
        return str;
    }
//    public String lastTwo(String str) {
//        if(str.length()<2) {
//            return str;
//        }
//
//        if(str.length()>=2) {
//            return  str.substring(0, str.length() - 2) + str.substring(str.length() - 2, str.length() - 1) + str.substring(str.length() - 1, str.length());
//        }
//        return str;
//    }

}
