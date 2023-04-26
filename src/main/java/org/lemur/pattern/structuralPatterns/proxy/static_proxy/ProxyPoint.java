package org.lemur.pattern.structuralPatterns.proxy.static_proxy;

/**
 * 代售点
 */
public class ProxyPoint implements SellTickets{

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代售点收取一些服务费用");
        trainStation.sell();
    }
}
