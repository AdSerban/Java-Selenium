package JavaString_1;

public class TwoChar {
    /**
     * Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.
     * <p>
     * <p>
     * twoChar("java", 0) → "ja"
     * twoChar("java", 2) → "va"
     * twoChar("java", 3) → "ja"
     *
     * @param str
     * @param index
     * @return
     */

//    public String twoChar(String str, int index) {
//
//        if(index == str.length()) {
//            return str.substring(0,2);
//        } else {
//
//            return str.substring(index,index+1);
//        }
//    }
    public String twoChar(String str, int index) {
        if (index == str.length() - 1 ||
                index < 0 ||
                index >= str.length()) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }

}
