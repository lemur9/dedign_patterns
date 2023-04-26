package org.lemur.pattern.creationalPatterns.builder.demo02;

/**
 * 手机类
 */
public class Phone {

    private final String cpu;
    private final String screen;
    private final String memory;
    private final String mainBoard;


    protected Phone(Builder builder) {
        this.cpu = builder.getCpu();
        this.screen = builder.getScreen();
        this.memory = builder.getMemory();
        this.mainBoard = builder.getMainBoard();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                '}';
    }
}
