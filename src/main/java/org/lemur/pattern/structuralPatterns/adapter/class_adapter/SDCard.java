package org.lemur.pattern.structuralPatterns.adapter.class_adapter;

/**
 * 目标接口(dst)
 */
public interface SDCard {

    //从SD卡中读取数据
    String readSD();

    //往SD卡中写数据
    void writeSD(String msg);
}
