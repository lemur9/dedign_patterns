package review.structuralMode.adapter.demo1;

interface Voltage5 {
    int output5V();
}

public class Adapter implements Voltage5 {

    Voltage220 voltage;

    public Adapter(Voltage220 voltage) {
        this.voltage = voltage;
    }

    @Override
    public int output5V() {
        return voltage.output220V() / 44;
    }
}

class Voltage220 {
    public int output220V() {
        return 220;
    }
}

class Client {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Voltage220());
        int i = adapter.output5V();
        System.out.println(i);
    }
}