package com.zch.aounhuipractice.gof.设计模式.结构型模式.decorator;

public class Decorator extends Drink {
    private Drink object;
    @Override
    public float cost() {
        return super.getPrice() + object.cost();
    }
    public Decorator(Drink d){
        this.object = d;
    }

    @Override
    public String getDsc() {
        return dsc + getPrice()+"&&"+object.getDsc();
    }

}
