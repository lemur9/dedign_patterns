package org.lemur.pattern.creationalPatterns.factory.factory_method;

/**
 * 咖啡店
 */
public class CoffeeStore {
    private CoffeeFactory factory;

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }


    public Coffee orderCoffee() {
        //调用生产咖啡的方法
        Coffee coffee = factory.createCoffee();

        //加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
