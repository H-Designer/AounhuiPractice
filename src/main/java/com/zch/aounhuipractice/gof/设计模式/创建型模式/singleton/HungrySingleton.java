package com.zch.aounhuipractice.gof.设计模式.创建型模式.singleton;

public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }
}
