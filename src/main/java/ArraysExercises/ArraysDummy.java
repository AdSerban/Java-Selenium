package ArraysExercises;


import java.util.Random;

public class ArraysDummy {
    public static void main(String[] args) {

        int a;

        //ArraysDummy arraysDummy =  new ArraysDummy();
//    int [] array= getRandmArray(10);
//        System.out.println(Arrays.toString(array));
//        Arrays.sort(array);
//        System.out.println(Arrays.toString(array));
//                for (int i=0; i<array.length;i++) {
//                    for (int j=i+1; j<array.length; j++) {
//                        if(array[i]<array[j]) {
//                            a = array[i];
//                            array[i] = array[j];
//                            array[j] = a;
//
//                        }
//
//                    }
//        }
//        System.out.println(Arrays.toString(array));


        String abc = "xxbadxx";
        String bca = "xbadx";
        ArraysDummy arraysDummy = new ArraysDummy();

        //System.out.println(arraysDummy.returnn(abc));
        System.out.println(arraysDummy.hasBad(abc));
        System.out.println(arraysDummy.conCat(abc, bca));
    }

    private static int[] getRandmArray(int len) {

        Random randm = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = randm.nextInt(100);
        }
        return newInt;
    }

    public String returnn(String a) {
        return a.substring(0, 1);
    }

    public String extraFront(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        } else if (str.length() < 2) {
            return str + str + str;

        }
        return str;

    }

    public String withoutEnd(String str) {
        if (str.length() == 2) {
            return str;
        } else if (str.length() > 2) {
            return str.substring(1, str.length() - 2);
        }
        return str;
    }

    public boolean hasBad(String str) {
        String b = "bad";
        if (str.length() < 3) {
            return false;

        } else if (str.length() > 3 && str.substring(0, 3).equals(b)) {
            return true;
        } else if (str.length() > 3 && str.substring(1, 4).equals(b)) {
            return true;
        }
        return false;
    }

    public String conCat(String a, String b) {

        if (a.length() == 0 || b.length() == 0) {
            return a + b;
        } else if (a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a + b.substring(1);

        }
        return a + b;
    }


    public boolean firstLast6(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[0] == 6 || nums[nums.length - 1] == 6) {
                return true;
            } else if (nums[0] != 6 || nums[nums.length - 1] != 6) {
                return false;
            }
        }
        return true;
    }
    // sau

    public boolean firstLast6_2(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[0] == 6 || nums[nums.length - 1] == 6) {
                return true;
            }
        }
        return false;
    }

    //----------------
    public boolean commonEnd(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
                    return true;
                }
            }
        }

        return false;

//        a = nums[i];
//        nums[i]=nums[nums.length-i-1];
//        a= nums[nums.length-1];
    }

//    public boolean cigarParty(int cigars, boolean isWeekend) {
//
//        if(!isWeekend && cigars>=40) {
//
//            return true;
//        }
//        if(!(isWeekend) && cigars=>40){
//            return true;
//
//        }
//        return false;
//
//    }

}
