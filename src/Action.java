//Интерфейс для выражения позитивных эмоций персонажем
interface PositiveExpressionAction {
    void laugh(int power) throws LocationException, PowerOfActionException;
}

//Интерфейс для выражения негативных эмоций персонажем
interface NegativeExpressionAction {
    void scream(int power) throws LocationException, PowerOfActionException;
}

//Интерфейс для взаимодействия с мебелью
interface FurnitureAction {
    void throwObjects(FrekenBok frekenBok);

}

//Интерфейс для взаимодействия с баррикадой
interface BarricadeAction {
    void disassembleBarricade(FrekenBok frekenBok) throws LocationException, PowerOfActionException;
}

//Интерфейс для смены локаций персонажем
interface LocationAction {
    void changeLocations(Locations place, int power) throws LocationException;
}