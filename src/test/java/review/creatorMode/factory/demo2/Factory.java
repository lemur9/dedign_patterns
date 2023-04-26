package review.creatorMode.factory.demo2;

public interface Factory {
    A getObject();
}

class BFactory implements Factory {
    @Override
    public A getObject() {
        return new B();
    }
}

class CFactory implements Factory {
    @Override
    public A getObject() {
        return new C();
    }
}

abstract class A {
    abstract void getName();
}

class B extends A {
    @Override
    void getName() {
        System.out.println("B");
    }
}

class C extends A {
    @Override
    void getName() {
        System.out.println("C");
    }
}

class Client {
    public static void main(String[] args) {
        Factory bFactory = new BFactory();
        bFactory.getObject().getName();
        System.out.println("----------------------");
        Factory cFactory = new CFactory();
        cFactory.getObject().getName();
    }
}