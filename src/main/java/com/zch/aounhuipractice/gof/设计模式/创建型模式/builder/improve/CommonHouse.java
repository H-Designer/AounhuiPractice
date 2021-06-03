package com.zch.aounhuipractice.gof.设计模式.创建型模式.builder.improve;

public class CommonHouse extends HouseBuilder {
    @Override
    void buildBasic() {
        System.out.println("普通房子建地基");
    }

    @Override
    void buildWalls() {
        System.out.println("普通房子砌墙");
    }

    @Override
    void roofed() {
        System.out.println("普通房子造屋顶");
    }


}
