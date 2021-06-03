package com.zch.aounhuipractice.gof.设计模式.创建型模式.singleton;

/**
 * 静态内部类懒加载
 * 调用getInstance时候，会将SingletonInstacen的类进行装载
 * 在类的装载过程中，是线程安全的，所以保证INSTANCE = new StaticSingleton()是线程安全的，从而保证线程安全性。
 */
public class StaticSingleton {

    private StaticSingleton(){}
    private static volatile StaticSingleton staticSingleton;
    private static class SingletonInstance{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }
    public static synchronized StaticSingleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
