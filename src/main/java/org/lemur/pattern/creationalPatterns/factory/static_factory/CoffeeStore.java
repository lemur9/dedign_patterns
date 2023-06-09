package org.lemur.pattern.creationalPatterns.factory.static_factory;

/**
 * 咖啡店
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        //调用生产咖啡的方法
        Coffee coffee = StaticCoffeeFactory.createCoffee(type);

        //加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
