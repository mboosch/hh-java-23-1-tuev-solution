package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarInspektionServiceTest {
    private final CarInspektionService carInspektionService = new CarInspektionService();
    @Test
    void checkTiresWith4TiresShouldReturnTrue() {
        //GIVEN
        int numberOfTires = 4;
        //WHEN
        boolean actual = carInspektionService.checkTires(numberOfTires);
        boolean expected = true;
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    void checkTiresWith3TiresShouldReturnFalse() {
        //GIVEN
        int numberOfTires = 3;
        //WHEN
        boolean actual = carInspektionService.checkTires(numberOfTires);
        boolean expected = false;
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void checkSeatBeltWithAnExistingSeatBeltShouldReturnTrue() {
        //GIVEN
        boolean seatBelt = true;
        //WHEN
        boolean actual = carInspektionService.checkSeatBelt(seatBelt);
        boolean expected = true;
        //THEN
        assertEquals(expected, actual);
    }
    @Test
    void checkSeatBeltWithNoSeatBeltShouldReturnFalse() {
        //GIVEN
        boolean seatBelt = false;
        //WHEN
        boolean actual = carInspektionService.checkSeatBelt(seatBelt);
        boolean expected = false;
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void checkAirbagWithExistingAirbagShouldReturnTrue0() {
    //GIVEN
    boolean airbag = true;
    //WHEN
    boolean actual = carInspektionService.checkAirbag(airbag);
    boolean expected = true;
    //THEN
    assertEquals(expected, actual);
    }

    @Test
    void checkAirbagWithNoAirbagShouldReturnFalse() {
    //GIVEN
    boolean airbag = false;
    //WHEN
    boolean actual = carInspektionService.checkAirbag(airbag);
    boolean expected = false;
    //THEN
    assertEquals(expected, actual);
    }

    @Test
    void checkDoorsWith3DoorsShouldReturnTrue() {
    //GIVEN
    int numberOfDoors = 3;
    //WHEN
    boolean actual = carInspektionService.checkDoors(numberOfDoors);
    boolean expected = true;
    //THEN
    assertEquals(expected, actual);
    }
    @Test
    void checkDoorsWith5DoorsShouldReturnTrue() {
    //GIVEN
    int numberOfDoors = 5;
    //WHEN
    boolean actual = carInspektionService.checkDoors(numberOfDoors);
    boolean expected = true;
    //THEN
    assertEquals(expected, actual);
    }
    @Test
    void checkDoorsWith4DoorsShouldReturnFalse() {
        //GIVEN
        int numberOfDoors = 4;
        //WHEN
        boolean actual = carInspektionService.checkDoors(numberOfDoors);
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