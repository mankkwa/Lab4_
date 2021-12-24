
public class Ghost extends Persons{

    private String sizeOfGhost;

    public Ghost(Locations place, String sizeOfGhost){
        super(place);
        this.sizeOfGhost = sizeOfGhost;
    }


    //Сеттер для задания размера привидения
    public void setSizeOfGhost(String sizeOfGhost) {
        this.sizeOfGhost = sizeOfGhost;
    }

    //Геттер для возврата размера привидения
    public String getSizeOfGhost() {
        return sizeOfGhost;
    }

    {
        name = "Привидение";
    }

}