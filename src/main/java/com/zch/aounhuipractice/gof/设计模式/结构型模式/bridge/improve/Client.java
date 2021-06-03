package com.zch.aounhuipractice.gof.设计模式.结构型模式.bridge.improve;

public class Client {
    public static void main(String[] args) {
        Phone phone = new FoledPhone(new XiaoMi());
        phone.open();
        phone.call();
        phone.close();
        System.out.println("==========|");
        Phone phone1 = new UPRightPhone(new VIVO());
        phone1.open();
        phone1.call();
        phone1.close();
    }
}
