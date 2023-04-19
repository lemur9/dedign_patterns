package org.lemur.pattern.structuralMode.adapter.object_adapter;


/**
 * 适配器类
 */
public class SDAdapterTF implements SDCard {

    //声明适配者类
    private final TFCard tfcard;

    public SDAdapterTF(TFCard tfcard) {
        this.tfcard = tfcard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfcard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfcard.writeTF(msg);
    }
}
