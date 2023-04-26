package review.creatorMode.prototype.demo1;

public class Prototype implements Cloneable {
    private String name;
    private int age;

    public Prototype(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype lemur = new Prototype("lemur", 23);
        Prototype clone = (Prototype) lemur.clone();
        System.out.println(lemur == clone);
    }
}
