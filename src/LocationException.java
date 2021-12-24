public class LocationException extends RuntimeException{

    private Locations place;
    public Locations getLocation(){
        return place;
    }

    public LocationException(Locations place){
        super("Недопустимая локация, " + place);
    }

}