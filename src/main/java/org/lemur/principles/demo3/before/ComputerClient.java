package org.lemur.principles.demo3.before;

public class ComputerClient {
    public static void main(String[] args) {

        XiJieHardDisk hardDisk = new XiJieHardDisk();

        IntelCpu cpu = new IntelCpu();

        KingstonMemory memory = new KingstonMemory();

        Computer computer = new Computer();

        computer.setCpu(cpu);
        computer.setHardDisk(hardDisk);
        computer.setMemory(memory);

        computer.run();
    }
}
