package com.zch.aounhuipractice.gof.设计模式.创建型模式.abstractFactory;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("奶酪pizza");
        System.out.println(name + "preparing");
    }

}
