package org.lemur.pattern.structuralMode.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        //创建代理对象
        //1.创建代理工厂对象
        ProxyFactory proxyPoint = new ProxyFactory();
        //2.使用factory对象的方法获取代理对象
        SellTickets proxyObject = proxyPoint.getProxyObject();
        //3.调用卖票的方法
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        while (true) {
        }
    }
}
