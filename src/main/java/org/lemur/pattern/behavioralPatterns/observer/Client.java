package org.lemur.pattern.behavioralPatterns.observer;

public class Client {
    public static void main(String[] args) {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        subscriptionSubject.attach(new User("lemur"));
        subscriptionSubject.attach(new User("xiaoming"));
        subscriptionSubject.attach(new User("xiaofang"));

        subscriptionSubject.notify("hello！");

    }
}
