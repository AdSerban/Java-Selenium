package W3Schools;

public class Ship {
    private final double draft;
    private final int crew;

    public Ship(double draft, int crew) {
        this.draft = draft;
        this.crew = crew;
    }


    public boolean isWorthIt(){

        if(draft-crew*1.5>20){
            return true;
        } return false;
    }

    public static void main(String[] args) {

        Ship titanic = new Ship(15, 10);
        Ship atyla = new Ship(50, 20);
        Ship ragnar = new Ship(35, 5);



        System.out.println(atyla.isWorthIt());
        System.out.println(ragnar.isWorthIt());
        System.out.println(titanic.isWorthIt());
    }
}
