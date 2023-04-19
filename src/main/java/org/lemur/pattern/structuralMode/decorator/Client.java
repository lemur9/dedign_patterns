package org.lemur.pattern.structuralMode.decorator;

public class Client {

    public static void main(String[] args) {
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

        System.out.println("================================");

        //在上面的炒饭中加一个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + "  " + food.cost() + "元");

    }
}
