package org.lemur.pattern.creatorMode.singleton.demo10;

import java.io.IOException;
import java.io.InputStream;

/**
 * Runtime源码解析
 */
public class RuntimeClient {
    public static void main(String[] args) throws IOException {
        //获取Runtime类的对象
        Runtime runtime = Runtime.getRuntime();

        //调用runtime的方法exec，参数要的是一个命令
        Process process = runtime.exec("ipconfig");

        //调用process对象的获取输入流的方法
        InputStream inputStream = process.getInputStream();
        byte[] bytes = new byte[1024 * 1024 * 100];
        //读取数据，返回读到的字节个数
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len,"GBK"));
    }
}
