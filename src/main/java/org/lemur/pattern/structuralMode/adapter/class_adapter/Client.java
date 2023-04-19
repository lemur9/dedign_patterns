package org.lemur.pattern.structuralMode.adapter.class_adapter;

public class Client {
    public static void main(String[] args) {
        //创建计算机对象
        Computer computer = new Computer();
        //读取SD卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        System.out.println("=============");

        String s = computer.readSD(new SDAdapterTF());
        System.out.println(s);
    }
}
