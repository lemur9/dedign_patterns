package org.lemur.pattern.builder.demo01;

/**
 * ofo单车构建者
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("铝合金车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
