package review.behavioralPatterns.strategy;

public abstract class Strategy {
    abstract void show();
}

class StrategyA extends Strategy {

    @Override
    void show() {
        System.out.println("StrategyA: show()");
    }
}

class StrategyB extends Strategy {

    @Override
    void show() {
        System.out.println("StrategyB: show()");
    }
}

class StrategyC extends Strategy {

    @Override
    void show() {
        System.out.println("StrategyC: show()");
    }
}

class User {
    private Strategy strategy;

    public User(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void toShow() {
        strategy.show();
    }
}

class Client {
    public static void main(String[] args) {
        User user = new User(new StrategyA());
        user.toShow();
        user.setStrategy(new StrategyB());
        user.toShow();
        user.setStrategy(new StrategyC());
        user.toShow();
    }
}