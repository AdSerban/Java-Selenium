package W3Schools;

public class TestClass {

    public static void main(String[] args) throws Exception {

        TestClass tc = new TestClass();
        tc.switchString("a");


//        boolean flag = true;
//        switch (flag) {
//            case true:
//                System.out.println("true");
//            default:
//                System.out.println("false");
//        }

        TestClass tc2 = new TestClass();
        while(tc2.tester()){
            System.out.println("running..."); }


        boolean greenLight = true;
        boolean pedestrian = false;
        boolean rightTurn = true;
        boolean otherLane = false;
        //You can go ahead only if the following expression evaluates to 'true' :
        //(( (rightTurn && !pedestrian || otherLane) || ( ? && !pedestrian && greenLight ) ) == true )


    }

    public void switchString(String input) {
        switch (input) {
            case "a":
                System.out.println("apple");
            case "b":
                System.out.println("bat");
                break;
            case "B":
                System.out.println("big bat");
            default:
                System.out.println("none");
        }
    }

    public boolean tester(){

        return true;
    }
}
