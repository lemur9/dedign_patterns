package org.lemur.principles.demo6.after;

/**
 * 车
 */
public class Car {

    protected Color color;

    public void move() {
        System.out.println("移动");
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
