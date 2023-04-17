package org.lemur.pattern.builder.demo01;

/**
 * 抽象构建者
 */
public abstract class Builder {

    //声明Bike类型的变量，并进行赋值
    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    //构建自行车的方法
    public abstract Bike createBike();

    public Bike construct() {
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}
