package JavaLogic_1;

public class In1To10 {
    public static void main(String[] args) {


    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (!outsideMode) {
            if (n >= 1 && n <= 10) {
                return true;
            } else {
                return false;
            }
        } else {
            if (n <= 1 || n >= 10) {
                return true;
            } else {
                return false;
            }
        }
    }

}