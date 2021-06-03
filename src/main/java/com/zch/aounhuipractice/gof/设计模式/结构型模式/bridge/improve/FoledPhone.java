package com.zch.aounhuipractice.gof.设计模式.结构型模式.bridge.improve;

public class FoledPhone extends Phone {
    public FoledPhone(Brand brand) {
        super(brand);
    }
    public void open(){
        System.out.println("折叠手机开机");
        super.open();
    }
    public void close(){
        System.out.println("折叠手机关机");
        super.close();
    }
    public void call(){
        System.out.println("折叠手机打电话");
        super.call();
    }
}
