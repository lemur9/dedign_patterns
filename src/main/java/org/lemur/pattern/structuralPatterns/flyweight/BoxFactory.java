package org.lemur.pattern.structuralPatterns.flyweight;

import java.util.HashMap;

/**
 * 工厂类，将该类设置为单例
 */
public class BoxFactory {
    private static BoxFactory factory = new BoxFactory();
    private HashMap<String, AbstractBox> map;

    //在构造方法中进行初始化操作
    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    //提供一个方法获取该类工厂类对象
    public static BoxFactory getInstance() {
        return factory;
    }

    //根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
