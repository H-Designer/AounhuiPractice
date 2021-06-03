package com.zch.aounhuipractice.gof.设计模式.结构型模式.decorator;

public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
