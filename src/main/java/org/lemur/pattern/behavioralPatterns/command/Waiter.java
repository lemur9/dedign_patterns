package org.lemur.pattern.behavioralPatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类（属于请求者角色）
 */
public class Waiter {
    //持有多个命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command cmd) {
        //将cmd对象存储到list集合中
        commands.add(cmd);
    }

    //发起命令功能
    public void orderUp() {
        System.out.println("订单来了");
        //遍历list集合
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }
}
