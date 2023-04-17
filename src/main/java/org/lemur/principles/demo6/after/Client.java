package org.lemur.principles.demo6.after;

public class Client {
    public static void main(String[] args) {
        Color red = new Red();
        Color white = new White();

        Car electricCar = new ElectricCar();
        electricCar.setColor(red);
        electricCar.move();

        Car petrolCar = new PetrolCar();
        petrolCar.setColor(white);
        petrolCar.move();
    }
}
