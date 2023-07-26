package ArraysExercises;

public class VerifyCNP {

    public static void main(String[] args) {
        String cnp = "2990219469000";

        if(cnp.length() != 13 || !cnp.matches("[0-9]+")) {
            System.out.println("Cnp invalid");
            return;
        }

        int [] constanta = {2,7,9,1,4,6,3,5,8,2,7,9};
        int sum = 0;
        for(int i=0 ;i<12;i++) {
            int cifCNP = Integer.parseInt(String.valueOf(cnp.charAt(12)));
            sum = sum +cifCNP * constanta[i];
        }

        int cifcCntrolCalculata = sum%11;
        int cifControlData = Integer.parseInt(String.valueOf(cnp.charAt(12)));

        if(cifcCntrolCalculata < 10 && cifcCntrolCalculata == cifControlData) {
            System.out.println("valid");
        } else if(cifcCntrolCalculata==10 && cifControlData==1) {
            System.out.println("valid");
        } else
            System.out.println("Cnp invalid");
    }
}
