package org.lemur.pattern.structuralPatterns.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象的工厂类,用来获取代理对象
 * <p>
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {
        //创建Enhancer对象，类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        //设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        //设置回调函数
        enhancer.setCallback(this);
        //创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取一些服务费用(CGLib代理)");
        //调用目标对象的方法
        Object invoke = method.invoke(trainStation, objects);
        return invoke;
    }
}
