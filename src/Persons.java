import java.util.Objects;

//Абстрактный класс для описания классов персонажей
abstract class Persons implements PositiveExpressionAction, LocationAction{

    protected String name;
    protected Locations place;

    public Persons(Locations place) {
        this.place = place;
    }

    //Геттер для возврата имени персонажа
    public String getName() {
        return name;
    }

    //Метод с действием смеха
    public void laugh(int power) throws PowerOfActionException{
        if (power < 0) throw new PowerOfActionException(power);
        if (power == 0){
            System.out.printf("%s не смеется.\n", name);
        } else if (power < 3){
            System.out.printf("%s смеется не очень громко.\n", name);
        } else if (power > 5){
            System.out.printf("%s смеется очень громко.\n", name);
        } else {
            System.out.printf("%s смеется.\n", name);
        }
    }

    //Геттер для возврата локации персонажа
    protected Locations getPlace() {
        return place;
    }

    //Метод для описания смены локации персонажа
    public void changeLocations(Locations place, int power){
        Locations oldPlace = this.place;
        this.place = place;
        String speed = "";
        if (power > 5){
            speed = "быстро";
        }
        System.out.printf("%s %s переместилось(-ась) от %s к %s.\n", name, speed, oldPlace, place);

    }

    // Метод для сравнения двух объектов
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Persons)) return false;
        Persons person = (Persons) o;
        return Objects.equals(name, person.getName()) &&
                Objects.equals(place, person.getPlace());
    }

    // Метод для представления объекта в строковом виде
    @Override
    public String toString() {
        return "Персонаж " + name;
    }

    // Метод для вычисления хэш-кода объекта
    @Override
    public int hashCode() {
        return Objects.hash(name, place);
    }

}
