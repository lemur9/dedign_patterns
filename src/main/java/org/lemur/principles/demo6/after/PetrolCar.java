package org.lemur.principles.demo6.after;

/**
 * 汽油汽车
 */
public class PetrolCar extends Car {
    @Override
    public void move() {
        System.out.println(color.getColor() + "汽油汽车移动");
    }
}
