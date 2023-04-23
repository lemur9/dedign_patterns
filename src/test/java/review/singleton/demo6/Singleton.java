package review.singleton.demo6;

public class Singleton {
    //禁止JVM对指令进行重排
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        //避免无谓的锁竞争
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}

class Client {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
