package com.zch.aounhuipractice.gof.设计模式.创建型模式.builder.improve;

abstract class HouseBuilder {
    protected House house = new House();
    abstract void buildBasic();
    abstract void buildWalls();
    abstract void roofed();
    public House buildHouse(){
        return house;
    }
}
