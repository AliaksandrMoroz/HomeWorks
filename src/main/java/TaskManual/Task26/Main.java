package TaskManual.Task26;

//Создать иерархию классов, описывающих бытовую технику.
// Создать несколько объектов описанных классов, часть из них включить в розетку.
//        Иерархия должна иметь хотя бы три уровня.

public class Main {
    public static void main(String[] args) {
        Laptop macBookAir =new Laptop();
        macBookAir.turnOnDevice();
        macBookAir.loadingBrowser();
        macBookAir.batteryRun();

        System.out.println();

        Refrigerator atlant =new Refrigerator();
        atlant.turnOnDevice();
        atlant.standInTheKitchen();
        atlant.changeTheTemperature();
    }
}
