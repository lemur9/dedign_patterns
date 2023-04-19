package org.lemur.pattern.structuralMode.adapter.class_adapter;

/**
 * 目标类
 */
public class SDCardImpl implements SDCard {
    @Override
    public String readSD() {
        String msg = "SDCard read msg: hello word SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg: " + msg);
    }
}
