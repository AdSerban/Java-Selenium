package JavaLogic_1;

public class AnswerCell {
    public static void main(String[] args) {
        System.out.println("Asa");
    }
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        } else if ((isMorning && isMom) || !isMorning) {
            return true;
        }
        return false;

    }
}
