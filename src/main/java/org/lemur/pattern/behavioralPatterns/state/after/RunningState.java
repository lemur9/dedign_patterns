package org.lemur.pattern.behavioralPatterns.state.after;

/**
 * 电梯运行状态类
 */
public class RunningState extends LiftState{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯正在运行...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
