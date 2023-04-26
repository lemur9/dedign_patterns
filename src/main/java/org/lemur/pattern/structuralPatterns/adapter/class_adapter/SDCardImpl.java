package org.lemur.pattern.structuralPatterns.adapter.class_adapter;

/**
 * 目标类
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        return "SDCard read msg: hello word SD";
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg: " + msg);
    }
}
