package org.lemur.pattern.structuralMode.decorator;

/**
 * 炒面(具体的构件角色)
 */
public class FriedNoodles extends FastFood {
    public FriedNoodles() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
