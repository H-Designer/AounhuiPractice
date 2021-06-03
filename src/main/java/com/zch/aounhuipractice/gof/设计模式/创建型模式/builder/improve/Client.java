package com.zch.aounhuipractice.gof.设计模式.创建型模式.builder.improve;

public class Client {
    public static void main(String args[]){
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        House house = houseDirector.constructHouse();
        System.out.println("----------");
        HighBuilding highBuilding = new HighBuilding();
        houseDirector = new HouseDirector(highBuilding);
        house = houseDirector.constructHouse();
    }
}
