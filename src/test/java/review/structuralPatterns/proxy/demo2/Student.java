package review.structuralPatterns.proxy.demo2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface Student {
    void getName();
}

class Student1 implements Student {

    @Override
    public void getName() {
        System.out.println("lemur");
    }
}

class StudentHandlerFactory implements InvocationHandler {

    Student student = new Student1();

    public static Student getProxy() {
        return (Student) Proxy.newProxyInstance(Student1.class.getClassLoader(), Student1.class.getInterfaces(), new StudentHandlerFactory());
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("I'm proxy");
        return method.invoke(student, args);
    }

}

class Client {
    public static void main(String[] args) {
        Student proxy = StudentHandlerFactory.getProxy();
        proxy.getName();
    }
}