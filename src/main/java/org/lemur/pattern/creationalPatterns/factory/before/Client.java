package org.lemur.pattern.creationalPatterns.factory.before;

public class Client {
    public static void main(String[] args) {
        //1.创建咖啡点类
        CoffeeStore coffeeStore = new CoffeeStore();
        //2.点咖啡
        Coffee coffee = coffeeStore.orderCoffee("american");

        System.out.println(coffee.getName());
    }
}
