package org.example;

public class CarInspektionService {

    public boolean checkTires(Car carToCheck) {
        return carToCheck.numberOfTires == 4;
    }

    public boolean checkSeatBelt(Car carToCheck) {
        return carToCheck.seatBelt;
    }

    public boolean checkAirbag(Car carToCheck) {
        return carToCheck.airbag;
    }

    public boolean checkDoors(Car carToCheck) {
        return carToCheck.numberOfDoors == 3 || carToCheck.numberOfDoors == 5;
    }

    public boolean checkCar(Car car) {
        return checkTires(car) && checkSeatBelt(car) && checkAirbag(car) && checkDoors(car);
    }


}
