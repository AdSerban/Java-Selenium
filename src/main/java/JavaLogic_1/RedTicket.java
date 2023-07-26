package JavaLogic_1;

public class RedTicket {

    /**
     *
     You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.


     redTicket(2, 2, 2) → 10
     redTicket(2, 2, 1) → 0
     redTicket(0, 0, 0) → 5
     * @param a
     * @param b
     * @param c
     * @return
     */

    public static void main(String[] args) {
        
    }
    public int redTicket(int a, int b, int c) {
        if(a ==2 && a==b && a==c) {
            return 10;
        }
        if(a!=2 && a==b && a==c) {
            return 5;
        }
        if(b != a && c != a) {
            return 1;
        } else return 0;
    }


}
