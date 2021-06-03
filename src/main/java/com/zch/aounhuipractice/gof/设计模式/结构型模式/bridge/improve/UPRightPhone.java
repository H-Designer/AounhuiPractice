package com.zch.aounhuipractice.gof.设计模式.结构型模式.bridge.improve;

public class UPRightPhone extends Phone {
    public UPRightPhone(Brand brand) {
        super(brand);
    }
    public void open(){
        System.out.println("直立手机开机");
        super.open();
    }
    public void close(){
        System.out.println("直立手机关机");
        super.close();
    }
    public void call(){
        System.out.println("直立手机打电话");
        super.call();
    }
}
