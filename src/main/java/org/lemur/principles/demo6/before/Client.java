package org.lemur.principles.demo6.before;

public class Client {
    public static void main(String[] args) {
        Car whiteElectricCar = new WhiteElectricCar();
        whiteElectricCar.move();

        Car redPetrolCar = new RedPetrolCar();
        redPetrolCar.move();
    }
}
