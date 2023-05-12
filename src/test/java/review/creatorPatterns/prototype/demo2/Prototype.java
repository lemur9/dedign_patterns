package review.creatorPatterns.prototype.demo2;

public class Prototype implements Cloneable {
    private A a;
    private int age;

    public Prototype(A a, int age) {
        this.a = a;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public A getA() {
        return a;
    }

    public void setA(A a) {
        this.a = a;
    }
}

class A implements Cloneable {
    private String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype lemur = new Prototype(new A("lemur"), 23);
        Prototype clone = (Prototype) lemur.clone();
        System.out.println(lemur == clone);
        System.out.println(lemur.getA() == clone.getA());
        System.out.println("--------------------------");
        clone.setA((A) lemur.getA().clone());
        System.out.println(lemur == clone);
        System.out.println(lemur.getA() == clone.getA());
    }
}