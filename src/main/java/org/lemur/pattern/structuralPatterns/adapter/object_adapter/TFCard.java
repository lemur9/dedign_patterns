package org.lemur.pattern.structuralPatterns.adapter.object_adapter;

/**
 * 适配者类的接口(src)
 */
public interface TFCard {

    //从TF卡中读取数据
    String readTF();

    //往TF卡中写数据
    void writeTF(String msg);
}
