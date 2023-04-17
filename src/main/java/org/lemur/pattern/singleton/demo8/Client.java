package org.lemur.pattern.singleton.demo8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Client {
    public static void main(String[] args) throws Exception {
        //writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }

    //从文件读取数据
    public static void readObjectFromFile() throws Exception {
        //1.创建对象输入流对象
        ObjectInputStream in = new ObjectInputStream(Files.newInputStream(Paths.get(".\\src\\main\\resources\\txt\\singleton.txt")));
        //2.读取对象
        Singleton instance = (Singleton) in.readObject();
        System.out.println(instance);
        //3.释放资源
        in.close();
    }

    //向文件中写数据（对象）
    public static void writeObject2File() throws Exception {
        //1.获取Singleton对象
        Singleton instance = Singleton.getInstance();
        //2.创建对象输出流对象
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(Paths.get(".\\src\\main\\resources\\txt\\singleton.txt")));
        //3.写对象
        objectOutputStream.writeObject(instance);
        //4.释放资源
        objectOutputStream.close();
    }
}
