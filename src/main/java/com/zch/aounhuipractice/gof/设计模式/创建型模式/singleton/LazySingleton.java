package com.zch.aounhuipractice.gof.设计模式.创建型模式.singleton;

public class LazySingleton{
    private static volatile LazySingleton instance = null; //volatile保证instance在所有线程中同步。
    private LazySingleton(){}//private 避免类外部被实例化
    public static synchronized LazySingleton getInstance(){
        if (instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}

