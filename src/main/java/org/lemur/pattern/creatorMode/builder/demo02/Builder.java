package org.lemur.pattern.creatorMode.builder.demo02;

/**
 * 构建者
 */
public class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainBoard;

    public String getCpu() {
        return cpu;
    }

    public String getScreen() {
        return screen;
    }

    public String getMemory() {
        return memory;
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder mainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        //使用构建者创建对象
        public Phone builder() {
            return new Phone(this);
        }
    }