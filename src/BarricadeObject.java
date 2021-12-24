//Класс с действиями над баррикадой
public class BarricadeObject extends Objects implements BarricadeAction{

    private Locations place;


    BarricadeObject(String size, Locations place){
        super(size);
        this.place = place;
    }

    private final String name;
    {
        name = " баррикада";
    }

    //Геттер для получения имени объекта
    public String getName() {
        return name;
    }

    //Сеттер для задавания локации
    public void setPlace(Locations place){
        this.place = place;
    }

    //Геттер для получения локации объекта
    public Locations getPlace(){
        return place;
    }

    private final BarricadeObject.DisassembleBarr obj = new BarricadeObject.DisassembleBarr();

    //Метод для разбора баррикады
    public void disassembleBarricade(FrekenBok frekenBok){
        DisassembleBarr obj = new DisassembleBarr();
        System.out.printf("%s %s. \n", frekenBok, obj.disassemble());
        obj = null;
        System.gc();
        System.out.println("Баррикада разрушена!");
    }


    //Действие - разобрать баррикаду
    public class DisassembleBarr{
        private final String name = BarricadeObject.this.name;
        String hurry = "быстро";
        String disassemble(){
            return hurry + " разбирает: " + BarricadeObject.this.size + name;
        }

    }

}
