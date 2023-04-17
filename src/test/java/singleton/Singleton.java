package singleton;

public class Singleton {
    private Singleton() {
    }

    public static Singleton getSingleton() {
        return Instance.singleton;
    }

    private static class Instance {
        private static volatile Singleton singleton = new Singleton();
    }
}
