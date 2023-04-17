package org.lemur.pattern.builder.demo02;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Builder().cpu("intel").screen("三星").mainBoard("华硕").memory("金百达").builder();
        System.out.println(phone);
    }
}
