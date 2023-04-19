package org.lemur.pattern.structuralMode.decorator;

/**
 * 炒饭(具体的构件角色)
 */
public class FriedRice extends FastFood{

    public FriedRice(){
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
