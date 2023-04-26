package org.lemur.pattern.creationalPatterns.builder.demo01;

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

    //也可以不使用指挥者构建产品对象
    public Bike construct() {
        this.buildFrame();
        this.buildSeat();
        return this.createBike();
    }
}
