package org.lemur.pattern.factory.abstract_factory;

/**
 * 美式风味工厂
 */
public class AmericanDCFactory implements DCFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MochaMousse();
    }
}
