package org.lemur.principles.demo2.demo2.before;

/**
 * 鸟
 */
public class Bird {
    // 飞行的速度
    private double flySpeed;

    public void setFlySpeed(double flySpeed) {
        this.flySpeed = flySpeed;
    }

    public double getFlyTime(double distance) {
        return distance/flySpeed;
    }
}



