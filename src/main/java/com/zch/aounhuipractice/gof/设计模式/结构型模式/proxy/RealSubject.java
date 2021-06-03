package com.zch.aounhuipractice.gof.设计模式.结构型模式.proxy;

public class RealSubject implements Subject {
    public void Request(){
        System.out.println("访问真实主题方法。。。");
    }
}
