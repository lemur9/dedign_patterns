package org.lemur.pattern.behavioralPatterns.template;

public class Client {
    public static void main(String[] args) {
        //炒包菜
        //创建对象
        ConcreteClass_BaoCai baocai = new ConcreteClass_BaoCai();
        //调用炒菜的功能
        baocai.cookProcess();
    }
}
