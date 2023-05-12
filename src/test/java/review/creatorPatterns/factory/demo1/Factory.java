package review.creatorPatterns.factory.demo1;

public class Factory {
    public static A getObject(String name) {

        A a = null;

        if ("B".equals(name)) {
            a = new B();
        } else if ("C".equals(name)) {
            a = new C();
        }
        return a;
    }
}

abstract class A {
    public abstract void getName();
}

class B extends A {

    @Override
    public void getName() {
        System.out.println("B");
    }
}

class C extends A {

    @Override
    public void getName() {
        System.out.println("C");
    }
}

class Client {
    public static void main(String[] args) {
        A b = Factory.getObject("B");
        b.getName();
        System.out.println("-----------------");
        A c = Factory.getObject("C");
        c.getName();
    }
}