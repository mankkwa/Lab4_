public class Main {

    public static void main(String[] args) throws PowerOfActionException {
        FrekenBok frekenBok = new FrekenBok(Locations.ROOM);
        Ghost ghost = new Ghost(Locations.BED, "Маленькое");
        FurnitureObject furniture = new FurnitureObject("средняя");
        BarricadeObject barricade = new BarricadeObject("внушительная", Locations.DOOR);

        ghost.changeLocations(Locations.ROOM, 5);
        try {
            ghost.laugh(2);
        } catch (PowerOfActionException e){
            e.printStackTrace();
            ghost.laugh(e.getAbsNumber());
        }
        frekenBok.laugh(0);
        frekenBok.changeLocations(Locations.DOOR, 6);
        furniture.throwObjects(frekenBok);
        barricade.disassembleBarricade(frekenBok);
        try {
            frekenBok.scream(2);
        } catch (PowerOfActionException e){
            e.printStackTrace();
            frekenBok.scream(e.getAbsNumber());
        }
        frekenBok.changeLocations(Locations.ANTECHAMBER, 8);
    }
}
