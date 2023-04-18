package org.lemur.pattern.creatorMode.prototype.demo03;

import java.io.Serializable;

public class Citation implements Cloneable, Serializable {

    //三好学生的姓名
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public void show() {
        System.out.println(stu.getName() + "同学获得三好学生奖状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
