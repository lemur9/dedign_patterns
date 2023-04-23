package review.singleton.demo7;

public class Singleton {
    private Singleton() {

    }

    public static Singleton getInstance() {
        return Instance.INSTANCE;
    }

    private static class Instance {
        private static final Singleton INSTANCE = new Singleton();
    }

}

class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
