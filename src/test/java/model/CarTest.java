package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void testDriveCarClass() {
        //GIVEN
        Car testCar = new Car();
        //WHEN
        String actual = testCar.drive();
        //THEN
        String expected = "Das Fahrzeug fährt auf der Straße";
        assertEquals(expected, actual);

    }
    @Test
    public void testStartCarClass() {
        //GIVEN
        Car testCar = new Car();
        //WHEN
        String actual = testCar.start();
        //THEN
        String expected = "Car Starts";
        assertEquals(expected, actual);
    }
}