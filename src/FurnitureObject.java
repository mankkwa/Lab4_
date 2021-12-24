//Класс с действиями над мебелью
class FurnitureObject extends Objects implements FurnitureAction{

    FurnitureObject(String size){
        super(size);
    }
    private final String name;
    {
        name = " мебель";
    }

    //Геттер для возврата имени объекта
    public String getName() {
        return name;
    }

    private final ThrowObj obj = new ThrowObj();

    //Действие - бросить предмет
    public void throwObjects(FrekenBok frekenBok){
        ThrowObj obj = new ThrowObj();
        System.out.printf("%s %s. \n", frekenBok, obj.throwObj());
    }

    private class ThrowObj{
        final String name = FurnitureObject.this.name;
        String throwObj(){
            return "швыряет: " + FurnitureObject.this.size + name;
        }
    }

}