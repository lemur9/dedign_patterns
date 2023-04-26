package org.lemur.pattern.creationalPatterns.singleton.demo5;

/**
 * 单例模式：懒汉式(双重检查锁)
 */
public class Singleton {
    //声明Singleton类型的变量instance
    private static volatile Singleton instance;

    //私有构造方法
    private Singleton() {
    }

    //对外提供访问方式
    public static Singleton getInstance() {
        //第一次判断，如果instance的值不为null，不需要抢占锁，直接返回对象
        if (instance == null) {
            synchronized (Singleton.class) {
                //第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
