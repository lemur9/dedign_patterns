package org.lemur.principles.demo3.after;

public class ComputerClient {
    public static void main(String[] args) {

        HardDisk hardDisk = new XiJieHardDisk();

        Cpu cpu = new IntelCpu();

        Memory memory = new KingstonMemory();

        Computer computer = new Computer();

        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        computer.run();
    }
}
