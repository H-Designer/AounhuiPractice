package com.zch.aounhuipractice.gof.设计模式.创建型模式.abstractFactory;

// 抽象工厂的抽象层
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
