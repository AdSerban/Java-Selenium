package JavaLogic_1;

public class NearTen {

    public static void main(String[] args) {

        NearTen nearTen = new NearTen();
        nearTen.nearTen(19);
    }
    public boolean nearTen(int num) {

        if(num%10 >=8 && num%10 <= 2)
            return true;
        else
            return false;
    }

}
