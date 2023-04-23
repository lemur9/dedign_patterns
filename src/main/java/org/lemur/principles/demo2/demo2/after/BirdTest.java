package org.lemur.principles.demo2.demo2.after;

/**
  * 测试飞行耗费时间
  */
public class BirdTest {
    public static void main(String[] args) {
        Bird bird1 = new Swallow();
        Animal bird2 = new Kiwi();
        bird1.setFlySpeed(120);
        bird2.setRunSpeed(110);
        System.out.println("如果飞行300公里：");
        try {
            System.out.println("燕子花费" + bird1.getFlyTime(300) + "小时.");
            System.out.println("几维鸟花费" + bird2.getRunTime(300) + "小时。");
        } catch (Exception err) {
            System.out.println("发生错误了!");
        }
    }
}