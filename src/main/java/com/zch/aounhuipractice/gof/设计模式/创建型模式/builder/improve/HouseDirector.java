package com.zch.aounhuipractice.gof.设计模式.创建型模式.builder.improve;

public class HouseDirector {
    HouseBuilder houseBuilder = null;
    HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    public void setHouseBuilder(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }
    //如何建造房子，建造房子的流程交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
