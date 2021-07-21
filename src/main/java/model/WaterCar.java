package model;

public class WaterCar extends Car{

    boolean waterProof = true;

    @Override
    public String drive() {
        String parentDriveInfo = super.drive();
        String driveInfo = " und fährt auch im Wasser!";
        String allInfo = parentDriveInfo + driveInfo;
        return allInfo;
    }
}
