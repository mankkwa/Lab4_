public class PowerOfActionException extends Exception{
    private final int number;

    public int getAbsNumber() {
        return number;
    }

    public PowerOfActionException(int number){
        super("Нельзя вводить отрицательную силу действия, " + number);
        this.number = Math.abs(number);
    }
}
