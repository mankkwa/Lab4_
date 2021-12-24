public enum Locations {
    ROOM ("Комната"),
    BED("Кровать"),
    ANTECHAMBER("Передняя"),
    DOOR("Дверь");

    private String title;

    Locations(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

}