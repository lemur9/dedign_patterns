package org.lemur.pattern.builder.demo01;

public class Client {
    public static void main(String[] args) {
        //创建指挥者对象
        Director director1 = new Director(new MobileBuilder());
        //让指挥者指挥组装自行车
        Bike bike1 = director1.construct();
        System.out.println(bike1.getFrame());
        System.out.println(bike1.getSeat());

        System.out.println("=====================");

        //创建指挥者对象
        //Director director2 = new Director(new OfoBuilder());
        OfoBuilder ofoBuilder = new OfoBuilder();
        //让指挥者指挥组装自行车
        Bike bike2 = ofoBuilder.construct();
        System.out.println(bike2.getFrame());
        System.out.println(bike2.getSeat());
    }
}
