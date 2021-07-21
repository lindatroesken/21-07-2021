package model;

public class WaterCar extends Car{

    boolean waterProof = true;

    @Override
    public String drive() {
        //super.drive();
        String driveInfo = "Fährt auch im Wasser!";
        return driveInfo;
    }
}
