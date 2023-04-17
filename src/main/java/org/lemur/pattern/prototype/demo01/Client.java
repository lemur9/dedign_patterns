package org.lemur.pattern.prototype.demo01;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //创建一个原型类对象
        RealizeType realizeType = new RealizeType();

        //调用RealizeType类中的clone方法进行对象的克隆
        RealizeType clone = realizeType.clone();

        System.out.println("原型对象和克隆出来的是否是同一个对象？" + (realizeType == clone));

    }
}
