package org.lemur.pattern.behavioralPatterns.state.before;

/**
 * 电梯类
 */
public class Lift implements ILift {

    //声明一个记录当前电梯的状态
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
         switch (state) {
             case OPENING_STATE:
                 break;
             case CLOSING_STATE:
                 System.out.println("电梯打开了...");
                 setState(OPENING_STATE);
                 break;
             case RUNNING_STATE:
                 break;
             case STOPPED_STATE:
                 System.out.println("电梯打开了...");
                 setState(OPENING_STATE);
                 break;
         }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE:
                System.out.println("电梯关门了...");
                setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                break;
            case RUNNING_STATE:
                break;
            case STOPPED_STATE:
                break;
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯停止了...");
                setState(STOPPED_STATE);
                break;
            case RUNNING_STATE:
                System.out.println("电梯停止了...");
                setState(STOPPED_STATE);
                break;
            case STOPPED_STATE:
                break;
        }
    }

    @Override
    public void run() {
        switch (state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯开始运行了...");
                setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPED_STATE:
                System.out.println("电梯开始运行了...");
                setState(RUNNING_STATE);
                break;
        }
    }
}
