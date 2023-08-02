package W3Schools;

public class BooleanTest {

    //You can go ahead only if the following expression evaluates to 'true' :

//    public static void main(String[] args) {
//        System.out.println();
//
//        boolean greenLight = true;
//        boolean pedestrian = false;
//        boolean rightTurn = true;
//        boolean otherLane = false;
//        System.out.println(( (rightTurn && !pedestrian || otherLane) || ( otherLane && !pedestrian && greenLight ) ) == true);
//    }


    public static void main(String[] args) {

        Object obj1 = new Object();
        Object obj2 = obj1;

        if (obj1.equals(obj2))
            System.out.println("true");
        else
            System.out.println("false");
    }

//    https://demo.guru99.com/
}
