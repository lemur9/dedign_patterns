package org.lemur.pattern.creationalPatterns.prototype.demo03;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        //1.创建原型对象
        Citation citation = new Citation();

        //创建张三对象
        Student student = new Student();
        student.setName("张三");
        citation.setStu(student);

        //创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(".\\src\\main\\resources\\txt\\student.txt")));
        //写对象
        oos.writeObject(citation);
        //释放资源
        oos.close();

        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(".\\src\\main\\resources\\txt\\student.txt")));
        //读取对象
        Citation citation1 = (Citation) ois.readObject();
        //释放资源
        ois.close();
        System.out.println("原型对象的Student对象和克隆出来的Student对象是否是同一个对象？" + (citation1.getStu() == citation.getStu()));
        Student stu = citation1.getStu();
        stu.setName("李四");

        citation.show();
        citation1.show();

    }
}
