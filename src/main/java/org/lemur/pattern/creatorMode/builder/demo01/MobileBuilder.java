package org.lemur.pattern.creatorMode.builder.demo01;

/**
 * 具体的构建者，构建摩拜单车对象
 */
public class MobileBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("碳纤维车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("碳纤维车座");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
