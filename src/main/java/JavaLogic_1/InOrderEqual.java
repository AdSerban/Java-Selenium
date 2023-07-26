package JavaLogic_1;

public class InOrderEqual {

    public static void main(String[] args) {

    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (!equalOk && a < b && b < c || equalOk && a <= b && b <= c) {
            return true;
        } else {
            return false;
        }
    }

}
