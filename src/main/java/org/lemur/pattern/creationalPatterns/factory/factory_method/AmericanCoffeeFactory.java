package org.lemur.pattern.creationalPatterns.factory.factory_method;

/**
 * 美式咖啡工厂
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
