package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspektionServiceTest {
    private final CarInspektionService carInspektionService = new CarInspektionService();

    @Test
    void checkTiresWith4TiresShouldReturnTrue() {
        //GIVEN
        Car testCar = new Car(4, 4, true, true);

        //WHEN
        boolean actual = carInspektionService.checkTires(testCar);
        boolean expected = true;
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void checkTiresWith3TiresShouldReturnFalse() {
        //GIVEN
        Car testCar = new Car(3, 4, true, true);
        //WHEN
        boolean actual = carInspektionService.checkTires(testCar);
        boolean expected = false;
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void checkSeatBeltWithAnExistingSeatBeltShouldReturnTrue() {
        //GIVEN
        Car testCar = new Car(4, 4, true, true);
        //WHEN
        boolean actual = carInspektionService.checkSeatBelt(testCar);
        boolean expected = true;
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void checkSeatBeltWithNoSeatBeltShouldReturnFalse() {
        //GIVEN
        Car testCar = new Car(4, 4, false, true);
        //WHEN
        boolean actual = carInspektionService.checkSeatBelt(testCar);
        boolean expected = false;
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void checkAirbagWithExistingAirbagShouldReturnTrue0() {
        //GIVEN
        Car testCar = new Car(4, 4, false, true);
        //WHEN
        boolean actual = carInspektionService.checkAirbag(testCar);
        boolean expected = true;
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void checkAirbagWithNoAirbagShouldReturnFalse() {
        //GIVEN
        Car testCar = new Car(4, 4, false, false);
        //WHEN
        boolean actual = carInspektionService.checkAirbag(testCar);
        boolean expected = false;
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void checkDoorsWith3DoorsShouldReturnTrue() {
        //GIVEN
        Car testCar = new Car(4, 3, false, false);
        //WHEN
        boolean actual = carInspektionService.checkDoors(testCar);
        boolean expected = true;
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void checkDoorsWith5DoorsShouldReturnTrue() {
        //GIVEN
        Car testCar = new Car(4, 5, false, false);
        //WHEN
        boolean actual = carInspektionService.checkDoors(testCar);
        boolean expected = true;
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void checkDoorsWith4DoorsShouldReturnFalse() {
        //GIVEN
        Car testCar = new Car(4, 4, false, false);
        //WHEN
        boolean actual = carInspektionService.checkDoors(testCar);
        boolean expected = false;
        //THEN
        assertEquals(expected, actual);

    }

    @Test
    void checkCarWithValidCarShouldReturnTrue() {
        //GIVEN
        Car car = new Car(4, 5, true, true);
        //WHEN
        boolean actual = carInspektionService.checkCar(car);
        boolean expected = true;
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void checkCarWithInvalidCarShouldReturnFalse() {
        //GIVEN
        Car car = new Car(3, 4, false, false);
        //WHEN
        boolean actual = carInspektionService.checkCar(car);
        boolean expected = false;
        //THEN
        assertEquals(expected, actual);
    }
}