package org.lemur.pattern.singleton.demo9;

import java.lang.reflect.Constructor;

public class Client {
    public static void main(String[] args) throws Exception {
        //1.获取Singleton的字节码对象
        Class<Singleton> clazz = Singleton.class;
        //2.获取无参构造方法对象
        Constructor<Singleton> cons = clazz.getDeclaredConstructor();
        //3.取消访问检查
        cons.setAccessible(true);
        //4.创建Singleton对象
        Singleton instance1 = cons.newInstance();
        Singleton instance2 = cons.newInstance();

        //如果返回的是false，说明破坏了单例模式
        System.out.println(instance1 == instance2);
    }
}
