package org.lemur.pattern.structuralMode.flyweight;

/**
 * L图形类(具体享元角色)
 */
public class LBox extends AbstractBox{
    @Override
    public String getShape() {
        return "L";
    }
}
