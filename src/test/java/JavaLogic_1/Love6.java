package JavaLogic_1;

public class Love6 {

    public static void main(String[] args) {

    }

    public boolean love6(int a, int b) {

        if (Math.abs(a&b)==6 || a+b==6 || a-b==6 || b-a==6 || a==6 || b==6 ){
            return true;
        }
        return false;
    }


}


//    public boolean love6(int a, int b) {
//
//        if( a==6 || b==6 || a+b==6 || a-b==6 || b-a==6){
//            return true;
//        } else
//            return false;
//
//
//    }