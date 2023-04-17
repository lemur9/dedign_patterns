package org.lemur.principles.demo5;

public class Client {
    public static void main(String[] args) {
        //创建经纪人对象
        Agent agent = new Agent();
        //创建明星对象
        Star star = new Star("Jack");
        agent.setStar(star);
        //创建粉丝对象
        Fans fans = new Fans("lemur");
        agent.setFans(fans);
        //创建媒体公司对象
        Company company = new Company("lee company");
        agent.setCompany(company);

        //和粉丝见面
        agent.meeting();

        //和媒体公司洽谈业务
        agent.business();
    }
}
