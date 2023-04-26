package review.structuralMode.proxy.demo1;

public interface Student {
    void getName();
}

class Student1 implements Student {

    @Override
    public void getName() {
        System.out.println("lemur");
    }
}

class Proxy implements Student {

    private Student student = new Student1();

    @Override
    public void getName() {
        System.out.println("I'm Proxy");
        student.getName();
    }
}

class Client {
    public static void main(String[] args) {
        Student proxy = new Proxy();
        proxy.getName();
    }
}
