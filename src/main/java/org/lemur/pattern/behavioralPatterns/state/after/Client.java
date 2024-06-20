package org.lemur.pattern.behavioralPatterns.state.after;

public class Client {
    public static void main(String[] args) {
        //创建环境角色对象
        Context context = new Context();

        context.setLiftState(new RunningState());

        context.run();
        context.open();
        context.close();
        context.stop();
    }
}
