package org.lemur.pattern.structuralMode.proxy.static_proxy;

/**
 * 火车站售票点
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
