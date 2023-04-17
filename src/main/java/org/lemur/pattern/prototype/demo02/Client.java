package org.lemur.pattern.prototype.demo02;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1.创建原型对象
        Citation citation = new Citation();
        //2.克隆奖状对象
        Citation clone = citation.clone();

        citation.setName("张三");
        clone.setName("李四");

        citation.show();
        clone.show();
    }
}
