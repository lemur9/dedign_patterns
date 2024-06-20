package org.lemur.pattern.behavioralPatterns.observer;

/**
 * 具体的观察者角色类
 */
public class User implements Observer{

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
