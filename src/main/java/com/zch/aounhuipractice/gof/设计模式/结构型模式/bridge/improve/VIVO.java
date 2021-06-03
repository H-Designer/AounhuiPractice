package com.zch.aounhuipractice.gof.设计模式.结构型模式.bridge.improve;

public class VIVO implements Brand {

    @Override
    public void open() {
        System.out.println("VIVO 开机");
    }

    @Override
    public void close() {
        System.out.println("VIVO 关机");
    }

    @Override
    public void call() {
        System.out.println("VIVO 打电话");
    }
}
