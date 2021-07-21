package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterCarTest {
    @Test
    public void testDriveWaterCarClass() {
        //GIVEN
        WaterCar testCar = new WaterCar();
        //WHEN
        String actual = testCar.drive();
        //THEN
        String expected = "Das Fahrzeug fährt auf der Straße und fährt auch im Wasser!";
        assertEquals(expected, actual);

    }

    @Test
    public void testStartWaterCarClass() {
        //GIVEN
        WaterCar testCar = new WaterCar();
        //WHEN
        String actual = testCar.start();
        //THEN
        String expected = "Car Starts";
        assertEquals(expected, actual);

    }
}