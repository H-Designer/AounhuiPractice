package com.zch.aounhuipractice.gof.设计模式.结构型模式.bridge.improve;

public class XiaoMi implements Brand {
    @Override
    public void open() {

        System.out.println("小米开机");
    }

    @Override
    public void close() {
        System.out.println("小米关机");

    }

    @Override
    public void call() {
        System.out.println("小米打电话");

    }
}
