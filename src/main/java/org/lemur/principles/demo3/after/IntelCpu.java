package org.lemur.principles.demo3.after;
/**
 * Intel 处理器
 */
public class IntelCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("使用Intel处理器");
    }
}
