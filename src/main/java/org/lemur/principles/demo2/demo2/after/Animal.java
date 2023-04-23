package org.lemur.principles.demo2.demo2.after;

/**
 * 动物
 */
public class Animal {
    private double runSpeed;

    public double getRunTime(double distance) {
        return distance/runSpeed;
    }

    public void setRunSpeed(double runSpeed) {
        this.runSpeed = runSpeed;
    }
}



