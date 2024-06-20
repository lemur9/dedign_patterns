package org.lemur.pattern.behavioralPatterns.state.after;

/**
 * 环境角色类
 */
public class Context {

    //定义对应状态对象的常量
    public final static OpeningState OPENING_STATE = new OpeningState();

    public final static ClosingState CLOSING_STATE = new ClosingState();

    public final static RunningState RUNNING_STATE = new RunningState();

    public final static StoppingState STOPPING_STATE = new StoppingState();

    //定义一个当前电梯状态变量
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void stop() {
        this.liftState.stop();
    }

    public void run() {
        this.liftState.run();
    }
}
