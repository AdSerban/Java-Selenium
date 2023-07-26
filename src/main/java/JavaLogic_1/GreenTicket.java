package JavaLogic_1;

public class GreenTicket {

    public int greenTicket(int a, int b, int c) {
        if (a != b && a != c && b != c) {
            return 0;
        }
        if (a == b && b == c) {
            return 20;
        }
        if (a == c && b != c || b == a && b != c || c == b && c != a) {
            return 10;
        }

        return 0;
    }

}
