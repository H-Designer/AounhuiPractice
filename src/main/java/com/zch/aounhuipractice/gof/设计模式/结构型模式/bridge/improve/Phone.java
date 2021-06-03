package com.zch.aounhuipractice.gof.设计模式.结构型模式.bridge.improve;

abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }
    protected void open(){
        this.brand.open();
    }
    protected void close(){
        this.brand.close();
    }
    protected void call(){
        this.brand.call();
    }
}
