package review.structuralMode.proxy.demo3;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Student {
    public void getName() {
        System.out.println("lemur");
    }
}

class StudentProxy implements MethodInterceptor {

    Student student = new Student();

    public Student getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Student.class);
        enhancer.setCallback(this);
        return (Student) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("I'm cglib Proxy");
        return method.invoke(student, objects);
    }
}

class Client {
    public static void main(String[] args) {
        StudentProxy studentProxy = new StudentProxy();
        Student proxy = studentProxy.getProxy();
        proxy.getName();
    }
}

