package com.zch.aounhuipractice.gof.设计模式.结构型模式.decorator;

public class Chocolate extends Decorator {
    public Chocolate(Drink d) {
        super(d);
        setDsc("巧克力");
        setPrice(3.0f);

    }
}
