package review.structuralPatterns.adapter.demo2;

interface Voltage5 {
    int output5();
}

public class Adapter {
    Voltage220 voltage;

    public Adapter(Voltage220 voltage) {
        this.voltage = voltage;
    }


}

class Voltage220 {
    public int output220() {
        return 220;
    }
}
