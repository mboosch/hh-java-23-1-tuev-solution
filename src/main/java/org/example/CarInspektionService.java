package org.example;

public class CarInspektionService {

    public boolean checkTires(int numberOfTires) {
        return numberOfTires == 4;
    }

    public boolean checkSeatBelt(boolean seatBelt) {
        return seatBelt;
    }

    public boolean checkAirbag(boolean airbag) {
        return airbag;
    }

    public boolean checkDoors(int numberOfDoors) {
        return numberOfDoors == 3 || numberOfDoors == 5;
    }

    public boolean checkCar(Car car) {
        return checkTires(car.getNumberOfTires()) && checkSeatBelt(car.isSeatBelt()) && checkAirbag(car.isAirbag()) && checkDoors(car.getNumberOfDoors());
    }


}
