package org.example;

public class Main {
    public static void main(String[] args) {
        Car validCar = new Car(4, 5, true, true);
        Car invalidCar = new Car(3, 4, true, true);
        CarInspektionService carInspektionService = new CarInspektionService();
        System.out.println(carInspektionService.checkCar(validCar));
        System.out.println(carInspektionService.checkCar(invalidCar));
    }
}