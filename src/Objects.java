abstract class Objects {

    protected String size;
    Objects(String size){
        this.size = size;
    }

    //Сеттер для задания размера объекта
    public void setObjectSize(String size){
        this.size = size;
    }

    //Геттер для возврата размера объекта
    public String getObjectSize(){
        return size;
    }

    // Метод для сравнения двух объектов
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Objects)) return false;
        Objects obj = (Objects) o;
        return java.util.Objects.equals(size, obj.getObjectSize());
    }

    // Метод для представления объекта в строковом виде
    @Override
    public String toString() {
        return "Размер объекта: " + size;
    }

    // Метод для вычисления хэш-кода объекта
    @Override
    public int hashCode() {
        return size.hashCode();
    }
}