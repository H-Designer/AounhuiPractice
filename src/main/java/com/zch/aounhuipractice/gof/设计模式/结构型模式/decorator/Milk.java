package com.zch.aounhuipractice.gof.设计模式.结构型模式.decorator;

public class Milk extends  Decorator {

    public Milk(Drink d) {
        super(d);
        setDsc("牛奶");
        setPrice(2.0f);
    }
}
