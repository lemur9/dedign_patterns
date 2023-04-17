package org.lemur.principles.demo6.after;

/**
 * 新能源汽车
 */
public class ElectricCar extends Car {
    @Override
    public void move() {
        System.out.println(color.getColor() + "新能源汽车移动");
    }
}
