package review.creatorMode.singleton.demo3;

public enum Singleton {
    INSTANCE
}

class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}
