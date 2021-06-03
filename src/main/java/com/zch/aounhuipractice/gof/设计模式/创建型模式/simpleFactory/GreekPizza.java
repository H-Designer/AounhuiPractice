package com.zch.aounhuipractice.gof.设计模式.创建型模式.simpleFactory;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        setName("GizzkPizza");
        System.out.println(name + "preparing");
    }
}
