package org.lemur.pattern.factory.before;

/**
 * 咖啡店
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {
        //声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("本店没有此类咖啡售卖");
        }
        //加配料
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
