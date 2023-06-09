package org.lemur.pattern.creationalPatterns.singleton.demo8;

import java.io.Serializable;

/**
 * 单例模式:懒汉式(静态内部类)
 */
public class Singleton implements Serializable {

    //私有构造方法
    private Singleton() {
    }

    //提供公共的访问方式
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }

    //定义一个静态内部类
    private static class SingletonHolder {
        //在内部类中声明并初始化外部类的对象
        private static final Singleton INSTANCE = new Singleton();
    }
}
