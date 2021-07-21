package model;

public class Car implements CarInterface{

    private String color = "red";
    private String brand = "Porsche";
    private int seats = 2;

    public String drive() {
       String driveInfo = "Das Fahrzeug fährt auf der Straße";
       return driveInfo;
    }

    @Override
    public String start() {
        return "Car Starts";
    }
}
