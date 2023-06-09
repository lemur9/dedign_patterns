package org.lemur.pattern.creationalPatterns.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        //创建意大利风味工厂对象
        ItalyDCFactory italyDCFactory = new ItalyDCFactory();
        Coffee coffee = italyDCFactory.createCoffee();
        Dessert dessert = italyDCFactory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
