package org.lemur.principles.demo2.demo1.after;

/**
 * 长方形类
 */
public class Rectangle implements Quadrilateral {

    private double length;

    private double width;

    @Override
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
