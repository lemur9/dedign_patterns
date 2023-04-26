package org.lemur.pattern.creationalPatterns.prototype.demo02;

public class Citation implements Cloneable {

    //三好学生的姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "同学获得三好学生奖状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
