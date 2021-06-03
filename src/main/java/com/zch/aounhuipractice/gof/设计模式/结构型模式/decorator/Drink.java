package com.zch.aounhuipractice.gof.设计模式.结构型模式.decorator;

public abstract class Drink {
    public String dsc;
    private float price = 0.0f;

    public String getDsc() {
        return dsc;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public abstract float cost();
}
