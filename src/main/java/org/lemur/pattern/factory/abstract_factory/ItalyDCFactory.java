package org.lemur.pattern.factory.abstract_factory;

/**
 * 意大利风味工厂
 */
public class ItalyDCFactory implements DCFactory {

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
