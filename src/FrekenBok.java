//Класс персонажа Фрекен Бок
public class FrekenBok extends Persons implements NegativeExpressionAction{

    FrekenBok(Locations place){
        super(place);
    }

    //Метод с действием крика Фрекен Бок

    static int power;
    public void scream(int power) throws PowerOfActionException {
        if (power < 0) throw new PowerOfActionException(power);
        if (power == 0) {
            System.out.printf("%s не кричит.\n", name);
        } else if (power < 3) {
            System.out.printf("%s кричит очень громко.\n", name);
        } else if (power > 5) {
            System.out.printf("%s кричит не очень громко.\n", name);
        } else {
            System.out.printf("%s кричит.\n", name);
        }

    }

    {
        name = "Фрекен Бок";
    }

}